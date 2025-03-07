package com.e_commerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	
	public UserDtls findByEmail(String email);

	public List<UserDtls> findByRole(String role);
	
	public UserDtls findByResetToken(String token);
	
}
