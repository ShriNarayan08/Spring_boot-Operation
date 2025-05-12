package com.example.demo.repository;

import com.example.demo.entity.User;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
	
		

		List<User> getUserByName(String name);

}
