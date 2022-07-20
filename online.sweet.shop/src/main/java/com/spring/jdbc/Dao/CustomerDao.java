package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entites.Admin;
import com.spring.jdbc.entites.Sweets;
import com.spring.jdbc.entites.customer.Customer;

public interface CustomerDao {
	
	public Customer getCustomer(String email,String password);
	
	public List<Customer> getAllCustomers();
	
	public int insert(Customer sweet);
	
	public int delete(int sweetId);
	
	public int update(Customer sweet);

}
