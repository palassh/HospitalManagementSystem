package com.hospital.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hospital.model.Receptionist;
import com.hospital.repository.ReceptionistRepository;

@Service

public class ReceptionistService {
	@Autowired
	public ReceptionistRepository receptionistRepository;
	
	public Receptionist createReceptionist(Receptionist receptionist) {
		return receptionistRepository.save(receptionist);
	}
	public List<Receptionist> getAllAppointments(){
		return receptionistRepository.findAll();
	}
	public Optional<Receptionist> getAppointmentDetailsById(int appointmentId){
		return receptionistRepository.findById(appointmentId);
	}
	public void deleteAppointmentDetailsById(int appointmentId) {
		receptionistRepository.deleteById(appointmentId);
	}
	public  Receptionist updateAppointment(Receptionist receptionist) {
		return receptionistRepository.save(receptionist);
	}
	public List<Receptionist> getAllAppointmentsByDrName(String doctorName){  
		return receptionistRepository.findByDoctorName(doctorName);
	}
	public List<Receptionist> getAllAppointmentsByPatientName(String patientName){  
		return receptionistRepository.findByPatientName(patientName);
	}
	
	public List<Receptionist> findByDate(LocalDate date, String doctorName){
		return receptionistRepository.findByDate(date, doctorName);
	}
	
}
	
