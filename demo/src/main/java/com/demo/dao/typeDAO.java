package com.demo.dao;

import java.util.List;

import com.demo.model.type;

public interface typeDAO {
	public void addType(type t);
	public void updateType(type t);
	public List<type> listtype();
	public type getTypeById(int id);
	public void removeType(int id);
}
