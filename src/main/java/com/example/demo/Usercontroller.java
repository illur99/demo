package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	@Autowired
	private Userservice userservice;
	@RequestMapping("/")
	public List<Userrecord> getAllUsers()
	{
	return	userservice.getAllUsers();
	}
	@PostMapping("/adduser")
	public void addUser(@RequestBody Userrecord user)
	{
		userservice.add(user);
	}
	
	
	
	

}
