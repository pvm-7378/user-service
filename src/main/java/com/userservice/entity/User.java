package com.userservice.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id",updatable = false,nullable = false)
	private UUID id;
	
	@Column(name = "name",nullable = false)
	private String name;
	@Column(name = "email",nullable = false,unique = true)
	private String email;

}
