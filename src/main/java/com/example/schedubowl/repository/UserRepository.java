package com.example.schedubowl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.schedubowl.entities.User;




public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
	
}


