package com.hospital.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Receptionist;
import com.hospital.service.ReceptionistService;

@RestController
public class ReceptionistController {
	@Autowired
	private ReceptionistService receptionistService;
	@RequestMapping(value = "/appointment", method = RequestMethod.POST)
	public Receptionist createReceptionist(@Valid @RequestBody Receptionist receptionist  ) {
		return receptionistService.createReceptionist(receptionist);
	}
	@RequestMapping(value="/appointments", method=RequestMethod.GET )
	public List<Receptionist> getAllAppointments() {
		return receptionistService.getAllAppointments();
	}
	
	
	@RequestMapping(value="/appointments/{appointmentId}", method=RequestMethod.GET )
	public Receptionist getAppointmentsById(@PathVariable("appointmentId") int aId) {
		Optional<Receptionist> receptionist = receptionistService.getAppointmentDetailsById(aId);
		return receptionist.get();
	}
	@RequestMapping(value="/appointments/drname/{doctorName}", method=RequestMethod.GET )
	public List<Receptionist> getAllAppointmentsByDrName(@PathVariable("doctorName") String drName){
		return receptionistService.getAllAppointmentsByDrName(drName);
	}
	@RequestMapping(value="/appointments/patientname/{patientName}", method=RequestMethod.GET )
	public List<Receptionist> getAllAppointmentsByPatientName(@PathVariable("patientName") String pName){
		return receptionistService.getAllAppointmentsByPatientName(pName);
	}
	@RequestMapping(value = "/appointment", method = RequestMethod.PUT)
	public Receptionist updateAppointment(@RequestBody Receptionist receptionist  ) {
		return receptionistService.updateAppointment(receptionist);
	}
	@RequestMapping(value="/appointments/{appointmentId}", method=RequestMethod.DELETE )
	public String deleteAppointmentDetailsById(@PathVariable("appointmentId") int aId) {
		Optional<Receptionist> r = receptionistService.getAppointmentDetailsById(aId);
		if(r.isPresent()) {
			receptionistService.deleteAppointmentDetailsById(aId);
			return "Appointment Details deleted with the Appointment Id: "+aId;
		}
		return "Appointment Id is not available";
		
	}
		
}	
