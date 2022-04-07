package com.example.bowlingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.example.bowlingdemo")
@EnableMongoRepositories


public class BowlingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BowlingDemoApplication.class, args);
	}

}
