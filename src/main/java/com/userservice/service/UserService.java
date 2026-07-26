package com.userservice.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.userservice.dto.request.RegisterRequest;
import com.userservice.entity.User;
import com.userservice.repository.UserRepository;

@Service
public class UserService {
	
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder ;
	
	public UserService(UserRepository userRepository,PasswordEncoder passwordEncoder) {
		
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder;
	}
	
	
	
	public User register(RegisterRequest request) {
		if(userRepository.existsByEmail(request.getEmail())) {
			throw new RuntimeException("email already registred");
		}
		User user=new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		
		return userRepository.save(user);
				
		
	}
	

}
