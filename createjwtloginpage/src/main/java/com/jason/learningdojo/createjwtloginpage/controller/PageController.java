package com.jason.learningdojo.createjwtloginpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String getLoginPage(Model model) {
		return "login";
	}
	
	@GetMapping("/home")
	public String getHomePage(Model model) {
		model.addAttribute("user", "nobody");
		return "home";
	}
}
