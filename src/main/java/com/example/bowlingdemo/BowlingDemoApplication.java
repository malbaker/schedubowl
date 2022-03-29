package com.example.bowlingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.example.bowlingdemo")


public class BowlingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BowlingDemoApplication.class, args);
	}

}
