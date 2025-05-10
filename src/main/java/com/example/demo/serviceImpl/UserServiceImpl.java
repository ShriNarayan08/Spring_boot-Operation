package com.example.demo.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepo userRepo;
	

	public User createUser(User user) 
	{
		return userRepo.save(user);
	}
	
	@Override
	public List<User> getAllUsers(){	
		return userRepo.findAll();	
	}
	
	@Override
	public User updateUser(String id, User user)
	{
		throw new UserNotFoundException("InCorrect id, Enter Correct User Id");
	}
	
	
	public User deleteUser(String id)
	{
		User user = (User) userRepo.findById(id).get();
		if(user != null)
		{
			userRepo.delete(user);
			return user;
		}
		throw new UserNotFoundException("InCorrect id, Enter Correct User Id");
	}
	
}