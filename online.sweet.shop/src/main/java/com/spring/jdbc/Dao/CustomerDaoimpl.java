package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entites.Admin;
import com.spring.jdbc.entites.Sweets;
import com.spring.jdbc.entites.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("sweetDao")
public class CustomerDaoimpl implements CustomerDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	public Customer getCustomer(String email, String password) {
		String query="Select * from customer where email=? && password=?";
		RowMapper<Customer> rowMapper=new RowMapImplCustomers();
		Customer customer =this.jdbcTemplate.queryForObject
				(query,rowMapper, email,password);
		return customer;
	}

	public List<Customer> getAllCustomers() {
		String query="select * from customer";
		List<Customer> customer=this.jdbcTemplate.query(query, new RowMapImplCustomers());
		return customer;
	}

	public int insert(Customer customer) {
		 String query="insert into customer (customername,email,password) values(?,?,?)";
	        int r=this.jdbcTemplate.update(query,
	        		customer.getCustomername(),customer.getEmail(),customer.getPassword());		
		return r;
	}

	public int delete(int sweetId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Customer sweet) {
		// TODO Auto-generated method stub
		return 0;
	}

}
