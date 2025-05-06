package com.example.demo.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	
	List<User> a1=new ArrayList<>();

	@Override
	public User createUser(User user) 
	{
		System.out.println("Service Class working");
		a1.add(user);
		return user;
	}
}