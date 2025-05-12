package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ViewController{

	@GetMapping("/home")
	public String homePage()
	{
//		System.out.println("...");
		return "index";
	}
	
}
