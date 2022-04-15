package com.example.bowlingexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.bowlingexample.user.User;




public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
	
}


