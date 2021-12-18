package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Patient;
import com.hospital.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;

	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> showAllDoctor() {
		return patientRepository.findAll();
	}

	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> getPatient() {
		return patientRepository.findAll();
	}

	public Optional<Patient> getDetailsById(int pid) {
		return patientRepository.findById(pid);
	}

	public void deletePatientDetailsById(int nid) {
		patientRepository.deleteById(nid);

	}

}
