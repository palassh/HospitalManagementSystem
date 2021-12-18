package com.hospital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.UserTable;
import com.hospital.service.IUserServiceImpl;
//import com.hospital.service.IUserServiceImpl;
//import com.hospital.service.UserNotFoundException;
import com.hospital.service.UserNotFoundException11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;




@RestController
//@RequestMapping("/Authenticate")
//@CrossOrigin(origins="http://localhost:4200")
public class UserManagementController {
	@Autowired
	HttpSession session;
	@Autowired
	IUserServiceImpl userImpl;
	
	static final Logger LOGGER = LoggerFactory.getLogger(UserManagementController.class);
	
	
	
	
	@GetMapping("/Check")
	public String check() {
		return "ok";
	}
	
	
	@PostMapping("/addUser")
	public UserTable addUser(@RequestBody UserTable user) {
		return userImpl.addNewUser(user);
	}
	
	
	
	@PostMapping("/Login")
	public UserTable login(@RequestBody RequestBinder obj) throws UserNotFoundException11 {
		LOGGER.info(obj.userName+","+obj.password);
		return userImpl.signIn(obj.userName, obj.password);
	}

	
	
	
	@GetMapping("/Logout")
	public ResponseEntity<String> logout() {
		session.invalidate();
		return new ResponseEntity<String>("logged out",HttpStatus.OK);
	}
	
	
}

class RequestBinder{
	String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String password;
	
}