package com.example.bowlingdemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepo extends MongoRepository<Customer, String>{
	
	@Query("{lastName:'?0'}")
	Customer findItemByName(String lastName);
	
	
}
