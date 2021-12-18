package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Discharge;
import com.hospital.model.Nurse;
import com.hospital.repository.NurseRepository;

@Service
public class NurseService {
	@Autowired
private NurseRepository nurseRepository;
	public Nurse addNurse(Nurse nurse) {
		return nurseRepository.save(nurse);
	}
	public List<Nurse> showAllNurse() {
		return nurseRepository.findAll();
	}
	public List<Nurse> getNurse() {
		return nurseRepository.findAll();
	}
 public Nurse updateNurse(Nurse nurse) {
	 return nurseRepository.save(nurse);
 }
 public Optional<Nurse> getDetailsById(int nid){
	 return nurseRepository.findById(nid);
	 }
 
 public void deleteNurseDetailsById(int nid) {
	 nurseRepository.deleteById(nid);

	 }
}
