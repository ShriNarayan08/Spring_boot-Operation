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

	@Override
	public User createUser(User user)
	{
		User newUser = userRepo.findById(Long.valueOf(user.getId())).orElse(null);
		if(newUser == null)
		return userRepo.save(user);
		throw new UserNotFoundException("NewUser Is Already Registered.....");
	}

	@Override
	public List<User> getAllUsers(){	
		return userRepo.findAll();	
	}

	@Override
	public User updateUser(String id, User user) {
		User updateUser = userRepo.findById(Long.valueOf(id)).orElse(null);
		if (updateUser != null) {

			updateUser.setName(user.getName());
			updateUser.setUserName(user.getUserName());
			updateUser.setPassword(user.getPassword());
			userRepo.save(updateUser);
			return updateUser;
		}
		throw new UserNotFoundException("Invalid User Id..." + id);
	}
	@Override
	public User deleteUser(String id)
	{
		User user = (User) userRepo.findById(Long.valueOf(id)).get();
		if(user != null)
		{
			userRepo.delete(user);
			return user;
		}
		throw new UserNotFoundException("InCorrect id, Enter Correct User Id");
	}
	
	@Override
	public List<User> getUserByName(String name){
	
		return userRepo.getUserByName(name);
	}

	public User login(String name, String password) {
		User user = userRepo.findByNameAndPassword(name,password);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

}