package com.hospital.service;

import com.hospital.model.UserTable;

public interface IUserService {
	public UserTable addNewUser(UserTable user);

	public UserTable signIn(String userName,String password)throws UserNotFoundException11;

	UserTable addNewUser1(UserTable user);
}
