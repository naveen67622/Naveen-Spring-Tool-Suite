package com.zensar.service;

import com.zensar.bean.User;

public interface IUserService {
	public User addNewUser(User user);
	public User signIn(User user);
	public  User signOut(User user);
	

}
