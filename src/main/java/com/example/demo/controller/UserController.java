package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;


	@PostMapping("/register")
	public String register(@RequestParam String id,@RequestParam  String  name, @RequestParam String userName, @RequestParam  String password) {
		User user = new User(id,name,userName,password);

		User u1 = userService.createUser(user);
		if(u1 != null)
		{
			return "login";
		}
		else {
			return "Redirect:/register?error";
		}

	}


	@PostMapping("/login")
	public String login(@RequestParam String name,
						@RequestParam String password
						) {
		User user = userService.login(name, password);
		if (user != null) {

			return "index";
		} else {

			return "Redirect:/login?error";
		}
	}
}