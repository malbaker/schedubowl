package com.example.schedubowl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.schedubowl.repository.RoleRepository;
import com.example.schedubowl.entities.UserRole;

@SpringBootApplication
@EnableMongoRepositories
public class SchedUBowlApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SchedUBowlApplication.class, args);
	
	
	}

	@Bean
    CommandLineRunner init(RoleRepository roleRepository) {

        return args -> {

            UserRole adminUserRole = roleRepository.findByRole("ADMIN");
            if (adminUserRole == null) {
                UserRole newAdminRole = new UserRole();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }

            UserRole userRole = roleRepository.findByRole("USER");
            if (userRole == null) {
                UserRole newUserRole = new UserRole();
                newUserRole.setRole("USER");
                roleRepository.save(newUserRole);
            }
        };

    }

}
