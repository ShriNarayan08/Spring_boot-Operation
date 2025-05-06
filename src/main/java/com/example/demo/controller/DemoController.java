package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.serviceImpl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController
{
	@Autowired
	UserServiceImpl impl;
	
	@PostMapping("/userName")
	public String getName()
	{
	return "Shri Narayan Tiwari";
	}
	
	@PostMapping("/create")
	public String show(@RequestBody User user) 
	{
	user = impl.createUser(user);
	return user.toString();
	}
	
}
	