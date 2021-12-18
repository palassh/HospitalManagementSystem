package com.hospital.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.UserTable;
import com.hospital.repository.IUserRepository;






@Service 
//@Transactional 
public  class IUserServiceImpl implements IUserService {
	
	
	//@Autowired
	IUserRepository IUserRepository;

	public UserTable addNewUser11(UserTable user) {
		
		IUserRepository.save(user);
		return user;
	}
	
	
	

	public UserTable signIn1(String userName,String password) throws UserNotFoundException11 {
		// TODO Auto-generated method stub
		if(!IUserRepository.existsById(userName))
			throw new UserNotFoundException11("User doesnt exist");
		UserTable user1=IUserRepository.findById(userName).orElse(null);
		if(!user1.getPassword().equals(password))
			throw new UserNotFoundException11("User doesnt exist");
		return user1;
	}

	@Override
	public UserTable addNewUser1(UserTable user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTable signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public UserTable addNewUser(UserTable user) {		// TODO Auto-generated method stub
		return null;
	}

	public UserTable signIn11(String userName, String password) throws UserNotFoundException11 {
		// TODO Auto-generated method stub
		return null;
}

	
}
	
