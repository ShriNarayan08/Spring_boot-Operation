package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController 
{

	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user){
		
		return userService.createUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		
		return userService.getAllUsers();
	}
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id , @RequestBody User user){
		
		return userService.updateUser(id,user);
	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id){
		
		return userService.deleteUser(id);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFoundException(UserNotFoundException ex) {
		
		return "Please Enter valid User Id";
		
		
	}
	
	
	
}
