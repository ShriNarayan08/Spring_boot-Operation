package com.example.demo.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

	List<User> al=new ArrayList<>();

	@Override
	public User createUser(User user) 
	{
		System.out.println("Service Class working");
		al.add(user);
		return user;
	}
	
	@Override
	public List<User> getAllUsers()
	{
		
		return al;	
	}
	
	@Override
	public User updateUser(String id, User user)
	{
		for(User u:al)
		{
			if(u.getId().equals(id))
			{
				u.setName(user.getName());
				u.setUserName(user.getUserName());
				return u;
			}
			
		}
		throw new UserNotFoundException("InCorrect id, Enter Correct User Id");
	}
	
	
	public User deleteUser(String id)
	{
		for(User u:al)
		{
			if(u.getId().equals(id))
			{
				al.remove(u);
				return u;
			}
			
		}
		throw new UserNotFoundException("InCorrect id, Enter Correct User Id");
	}
	
}