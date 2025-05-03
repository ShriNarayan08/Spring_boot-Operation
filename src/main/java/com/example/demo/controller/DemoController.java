package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{

	@PostMapping("/userN")
	public String getName()
	{
		return "Shri Narayan Tiwari" ;
	}
	
	
	@GetMapping("/userId")
	public String getId(@RequestParam(required = false) String id)
	{
		List<String>  l1 = new ArrayList<>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		l1.add("6");
		l1.add("7");
		l1.add("8");
		l1.add("9");
		l1.add("10");
		if(id != null)
		{
			for(String s: l1)
			{
				if(s.equals(id))
					return s;
			}
			return "";
		}
		return l1.toString();
	}
	
}
