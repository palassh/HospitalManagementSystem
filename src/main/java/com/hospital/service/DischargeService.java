package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Discharge;
import com.hospital.repository.DischargeRepository;
@Service
public class DischargeService {

	@Autowired
	private DischargeRepository dischargeRepository;
	public Optional<Discharge> getDetailsById;

	public Discharge createDischarge(Discharge discharge) {
		return dischargeRepository.save(discharge);
	}

	public List<Discharge> getDischarge() {
		return dischargeRepository.findAll();
	}
	public Optional<Discharge> getDetailsById(int pid){
		return dischargeRepository.findById(pid);
	}

	public void deletePatientDetailsById(int pid) {
		dischargeRepository.deleteById(pid);
	
	}
	public Optional<Discharge> getDetailsById1(int pid){
		return dischargeRepository.findById(pid);
	}

	public Discharge updateDischarge(Discharge discharge) {
		return dischargeRepository.save(discharge);
	
	}

	//public void signInAuthentication(String signin) {
		//return dischargeRepository.signInAuthentication(signin);

		
	//}

	//public void signout(String signout) {
	
		
	//}

}