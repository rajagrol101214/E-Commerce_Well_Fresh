package com.e_commerce.service;

import java.util.List;

import com.e_commerce.model.UserDtls;

public interface UserService {
	
	public UserDtls saveUser(UserDtls user);
	
	public UserDtls getUserByEmail(String email);
	
	public List<UserDtls> getAllUsers(String role);

	public Boolean updateAccountStatus(Integer id, Boolean status);
}
