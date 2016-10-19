package com.demo.service;

import java.util.List;

import com.demo.model.person;


public interface personservice
{
	public void insert(person p);
	public void update(person p);
	public void delete(int uid);
	
	public person getperson(int uid);
	
	public List<person> listAll();
	
}

