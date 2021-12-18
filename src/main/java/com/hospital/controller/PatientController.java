package com.hospital.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Nurse;
import com.hospital.model.Patient;
import com.hospital.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/getpatient", method = RequestMethod.GET)
	public List<Patient> getPatient() {
		return patientService.getPatient();
	}

	@RequestMapping(value = "/patienti", method = RequestMethod.POST)
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}

	@RequestMapping(value = "/patient", method = RequestMethod.PUT)
	public Patient updatePatientDetails(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}

	@RequestMapping(value = "/patient/{patientId}", method = RequestMethod.DELETE)
	public String deletePatientDetailsById(@PathVariable("patientId") int pid) {
		Optional<Patient> d = patientService.getDetailsById(pid);
		if (d.isPresent()) {
			patientService.deletePatientDetailsById(pid);
			return "The Patient details deleted with the Patient Id: " + pid;
		}

		return "The Patient details is not deleted with the Patient Id:" + pid;

	}

}
