package com.jason.learningdojo.createjwtloginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.jason.learningdojo.createjwtloginpage.service.JwtLoginService;

@Controller("/api")
public class LoginController {
	
	@Autowired
	JwtLoginService jwtLoginService;

	@PostMapping("/login")
	public String login() {
		return "abcv";
	}
}
