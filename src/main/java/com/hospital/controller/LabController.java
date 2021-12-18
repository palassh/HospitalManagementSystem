package com.hospital.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Lab;
import com.hospital.service.LabService;

@RestController

public class LabController {
	@Autowired
	private LabService labService;
	
	@RequestMapping(value = "/lab", method = RequestMethod.POST)
	public Lab createLab(@Valid @RequestBody Lab lab) {
		return labService.createLab(lab);
	}
	
	@RequestMapping(value = "/lab", method = RequestMethod.GET)
	public List<Lab> getLab() {
		return labService.getLab();
	}
	
	@RequestMapping(value = "/getlab/{labId}", method = RequestMethod.GET)
	public Optional<Lab> getDetailsById(@PathVariable("labId") int lid){
		return labService.getDetailsById(lid);
	}
	
	@RequestMapping(value = "/lab/{labId}", method = RequestMethod.DELETE)
	public String deleteById(@PathVariable("labId") int lid) {
		labService.deleteById(lid);
		return "Deleted";
	}
	
	@RequestMapping(value = "/lab", method = RequestMethod.PUT)
	public Lab updateLab(@RequestBody Lab lab) {
		return labService.updateLab(lab);
	}
	
	@RequestMapping(value="/deleteLabById/{labId}", method=RequestMethod.DELETE)
	public ResponseEntity<Lab> deleteLabDetailsById(@PathVariable("labId") int lid){
		return labService.deleteBankDetailsById(lid);
	}
}
