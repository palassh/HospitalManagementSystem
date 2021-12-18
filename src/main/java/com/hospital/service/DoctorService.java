package com.hospital.service;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;
   

	@Service
	public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
//	public Doctor addDoctor(Doctor doctor) {
//		return doctorRepository.save(doctor);
//	}
public List<Doctor> showAllDoctors(){
		return (List<Doctor>) doctorRepository.findAll();
	}
public Doctor updateDoctor(Doctor doctor) {
	return doctorRepository.save(doctor);
	}
	public List<Doctor> getDetailsBySpecialization(String specialization) {
	return doctorRepository.findBySpecialization(specialization);
}
	public Doctor createDoctor ( Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	public List<Doctor> getDetailsByExperience(int experience){
		return doctorRepository.findByExperience(experience);
	}
	public void deleteDoctorId(int dId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(dId);
	}
	public Optional<Doctor> getDoctorId(int dId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(dId);
	}
	}

