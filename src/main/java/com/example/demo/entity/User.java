package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	
	@Override
	public String toString() 
	{
		return "User [id=" + id + ",name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
		
	public User()
	{
		
	}
	public User(String id,String name, String userName, String password) 
	{
		super();
		this.name = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	

	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	
	public String getPassword(){
		return password;
	}

	
	public void setpassword(String password){
		this.password=password;
	}
	
}