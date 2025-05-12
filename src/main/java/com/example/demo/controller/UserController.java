package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@GetMapping("/find")
	public List<User> findUser(@RequestParam String name){
		return userService.getUserByName(name);		
	}
	
	

	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFoundException(UserNotFoundException ex) {
		return "Please Enter valid User Id";
	}
}
