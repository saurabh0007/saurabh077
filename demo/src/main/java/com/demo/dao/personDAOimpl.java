package com.demo.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import com.demo.model.person;


@Repository
@EnableTransactionManagement
public class personDAOimpl implements personDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	public void insert(person p) {
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		
	}

	public void update(person p) {
		sessionFactory.getCurrentSession().update(p);
		// TODO Auto-generated method stub
		
	}

	public void delete(int uid) {
		//sessionFactory.getCurrentSession().createQuery("delete from  person p where p.id = :id").setInteger("id", uid).executeUpdate();
		// TODO Auto-generated method stub
		
	}

	public person getperson(int uid) {
List<person> list = sessionFactory.getCurrentSession().createQuery("from person p where p.id = :id").setInteger("id", uid).list();
		
		if( !list.isEmpty() )
			return list.get(0);
		else
		// TODO Auto-generated method stub
		return null;
	}

	public List<person> listAll() {
		List<person> list = sessionFactory.getCurrentSession().createQuery("from peron p").list();
		// TODO Auto-generated method stub
		return null;
	}
		
}
