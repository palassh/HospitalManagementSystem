package com.hospital.controller;
	import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;

	

	@RestController
	public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@RequestMapping(value="/do")
	public String home() {	
	          return "Welcome to Hospital Management System";
	       }
	@PostMapping(value="/doctor")
	public Doctor createDoctor(@Valid @RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
		
	}
    @RequestMapping(value="/doctor", method=RequestMethod.GET)
	public List<Doctor> showAllDoctors(){
	return doctorService.showAllDoctors();
	}
    @RequestMapping(value="/doctor", method=RequestMethod.PUT)
	public Doctor updateDoctorDetails(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}
	@RequestMapping(value="/doctor/{specialization}", method=RequestMethod.GET)
	public List<Doctor> getDoctorDetailsBySpecialization(@PathVariable("specialization")String dSpecialization) {
	return doctorService.getDetailsBySpecialization(dSpecialization);
	}
	@RequestMapping(value="/doctor/{experience}", method = RequestMethod.GET)
	public List<Doctor> getDoctorDetailsByExperience(@PathVariable("experience")int dExperience){
		return doctorService.getDetailsByExperience(dExperience);
	}
	@RequestMapping(value="/docttor/{id}", method=RequestMethod.DELETE)
	public String deleteDoctorId(@PathVariable("id")int dId) {
		Optional <Doctor> d=doctorService.getDoctorId(dId);
		if(d.isPresent()) {
			doctorService.deleteDoctorId(dId);
			return "Doctor details with ID "+dId+" is deleted";
		}
		return "Doctor Id is not available";
	}
	}