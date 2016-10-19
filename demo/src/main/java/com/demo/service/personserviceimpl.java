package com.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.personDAO;
import com.demo.model.person;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
public class personserviceimpl implements personservice{

	@Autowired
	personDAO udao;

	public void insert(person p) {
		// TODO Auto-generated method stub
		udao.insert(p);
	}

	public void update(person p) {
		// TODO Auto-generated method stub
		udao.update(p);
	}

	public void delete(int uid) {
		// TODO Auto-generated method stub
		udao.delete(uid);	
	}

	public person getperson(int uid) {
		// TODO Auto-generated method stub
		 return udao.getperson(uid);
	}

	public List<person> listAll() {
		// TODO Auto-generated method stub
		return udao.listAll();
	}

}
	