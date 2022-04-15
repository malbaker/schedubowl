package com.example.bowlingexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.bowlingexample.entities.UserRole;

public interface RoleRepository extends MongoRepository<UserRole, String>{
	
	UserRole findByRole(String role);
	
}
