package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entites.Admin;
import com.spring.jdbc.entites.Sweets;

public interface SweetDao {
	
	public Admin getAdmin(String username,String password);
	
	public List<Sweets> getAllSweets();
	
	public int insert(Sweets sweet);
	
	public int delete(int sweetId);
	
	public int update(Sweets sweet);

}
