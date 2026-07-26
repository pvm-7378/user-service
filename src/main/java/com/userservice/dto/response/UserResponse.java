package com.userservice.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserResponse {
	
	public UUID id;
	
	public String name;
	
	public String email;
	
	public LocalDateTime createdAt;
	
	
	 public UserResponse(UUID id, String name, String email, LocalDateTime createdAt) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.createdAt = createdAt;
	    }


	 public UUID getId() {
		 return id;
	 }


	 public String getName() {
		 return name;
	 }


	 public String getEmail() {
		 return email;
	 }


	 public LocalDateTime getCreatedAt() {
		 return createdAt;
	 }
	 
	 

}
