package com.example.schedubowl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.schedubowl.entities.UserRole;

public interface RoleRepository extends MongoRepository<UserRole, String>{
	
	UserRole findByRole(String role);
	
}
