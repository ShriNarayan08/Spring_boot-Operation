package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController{

	@GetMapping("/register")
	public String showRegisterForm() {

		return "registration";
	}

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}


}
