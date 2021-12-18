package com.hospital.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Discharge;
import com.hospital.model.Nurse;
import com.hospital.service.NurseService;



@RestController
public class NurseController {
	@Autowired
 private NurseService nurseService;
 
 @RequestMapping (value = "/nurse", method=RequestMethod.GET)
 public String welcome() {
	 return "Welcome to Hospital management system";
	 
 }
 @RequestMapping(value="/nurse",method=RequestMethod.POST)
 public Nurse addNurse( @RequestBody Nurse nurse) {
	 return  nurseService.addNurse(nurse);
 }
 @RequestMapping(value = "/getnurse", method = RequestMethod.GET)
	public List<Nurse> getNurse() {
		return nurseService.getNurse();
	}
 
 @RequestMapping(value="/nur",method=RequestMethod.PUT)
 public Nurse updateNurseDetails(@RequestBody Nurse nurse) {
	 return nurseService.updateNurse(nurse);
 }

 
 @RequestMapping(value = "/delete{nurseId}", method = RequestMethod.DELETE)
 public String deleteNurseDetailsById(@PathVariable("nurseId") int nid) {
 Optional<Nurse> d=nurseService.getDetailsById(nid);
 if(d.isPresent()) {
 nurseService.deleteNurseDetailsById(nid);
 return "The Nurse details deleted with the Nurse Id: "+nid;
 }

 return "The Nurse details is not deleted with the Nurse Id:"+nid;


 }
 }
	
 




