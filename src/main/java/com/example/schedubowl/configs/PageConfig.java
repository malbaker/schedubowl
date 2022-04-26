package com.example.schedubowl.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
PageConfig: Class for establishing view controllers, part of the model view architecture, for each site in the application
 */

@Configuration
public class PageConfig implements WebMvcConfigurer{
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder( ) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/admin_dash").setViewName("admin_dash");
        registry.addViewController("/user_dash").setViewName("user_dash");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/reserve").setViewName("reserve");
        registry.addViewController("/view_res").setViewName("view_res");
    }
}
