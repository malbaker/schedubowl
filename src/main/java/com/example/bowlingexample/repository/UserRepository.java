package com.example.bowlingexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.bowlingexample.user.User;




public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
	
}


