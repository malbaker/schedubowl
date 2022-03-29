package com.example.bowlingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String user_id, @RequestParam String pass){
		if(user_id.equals("admin")&& pass.equals("root")) {
			return "welcome";
		}
		model.put("errorMsg","Please provide the correct User ID and Password");
		return "login";
	}
	
}
