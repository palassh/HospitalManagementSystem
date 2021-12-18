package com.hospital.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Discharge;
import com.hospital.service.DischargeService;

@RestController
public class DischargeController {
	@Autowired
	private DischargeService dischargeService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to Discharge Details";
	}
	
	@RequestMapping(value = "/dis", method = RequestMethod.POST)
	public Discharge createDischarge(@Valid @RequestBody Discharge discharge) {
		return dischargeService.createDischarge(discharge);
		//return new ResponseEntity<>("Patient not found", HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/getdischarge", method = RequestMethod.GET)
	public List<Discharge> getDischarge() {
		return dischargeService.getDischarge();
	}
	
	@RequestMapping(value = "/discharge", method = RequestMethod.PUT)
	public Discharge updateDischargeDetails(@RequestBody Discharge discharge) {
	return dischargeService.updateDischarge(discharge);
	}
	@RequestMapping(value = "/deleteDischarge/{patientId}", method = RequestMethod.DELETE)
	public String deletePatientDetailsById(@PathVariable("patientId") int pid) {
		Optional<Discharge> d=dischargeService.getDetailsById(pid);
		if(d.isPresent()) {
			dischargeService.deletePatientDetailsById(pid);
			return "The patient details deleted with the Patient Id: "+pid;
		}
		
		return "The patient details 7is not deleted with the Patient Id:"+pid;

	}
}
//	@GetMapping("/signin")
//	public String signinSuccessGet(Model model, @RequestParam(value="signin",required=false)String signin) {
//		dischargeService.signInAuthentication(signin);
//		return "signin Successfully";
//	}
//}
//	}
//	@GetMapping("/signout")
//	public String signout(Model model) {
//		dischargeService.signout(signout);
//		return "signout";
//	}
//}