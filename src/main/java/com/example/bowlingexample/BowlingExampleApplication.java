package com.example.bowlingexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.bowlingexample.repository.RoleRepository;
import com.example.bowlingexample.user.UserRole;

@SpringBootApplication
@EnableMongoRepositories
public class BowlingExampleApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BowlingExampleApplication.class, args);
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
