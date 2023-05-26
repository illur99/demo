package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	@Autowired
	Userrepository userrepo;
	
	List<Userrecord> getAllUsers()
	{
		List<Userrecord> user=new ArrayList<>();
		userrepo.findAll().forEach(user::add);
		return user;
	}
	
	public void add(Userrecord userrecord)
	{
		userrepo.save(userrecord);
	}
	
}