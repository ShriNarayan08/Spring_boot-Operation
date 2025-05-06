package com.example.demo.entity;

public class User 
{
	private String name;
	String userName;
	String password;
	@Override
	public String toString() 
	{
		return "User [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	
	public User(String name, String userName, String password) 
	{
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public String getName() 
	{
		return name;
	}

	public String getUserName() 
	{
		return userName;
	}

	public String getPassword() 
	{
		return password;
	}

	
}