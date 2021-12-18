package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.model.Lab;
import com.hospital.repository.LabRepository;

@Service
public class LabService {
	@Autowired
	private LabRepository labRepository;

	public Lab createLab(Lab lab) {
		return labRepository.save(lab);
	}

	public List<Lab> getLab() {
		return labRepository.findAll();
	}

	public void deleteById(int labId) {
		labRepository.deleteById(labId);
	}

	public Lab updateLab(Lab lab) {
		return labRepository.save(lab);
	}

	public Optional<Lab> getDetailsById(int lid) {
		return labRepository.findById(lid);
	}
	
	public ResponseEntity<Lab> deleteBankDetailsById(int lid) {
		Lab existingCustomer = this.labRepository.findById(lid)
				.orElseThrow(() -> new ResourceNotFoundException("user not found with id: " + lid));
		this.labRepository.delete(existingCustomer);
		return ResponseEntity.ok().build();
	}
}
