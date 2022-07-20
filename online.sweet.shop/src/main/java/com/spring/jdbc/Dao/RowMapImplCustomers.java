package com.spring.jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Sweets;
import com.spring.jdbc.entites.customer.Customer;

public class RowMapImplCustomers implements RowMapper<Customer>{

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer customer=new Customer();
		customer.setCustomerid(rs.getInt(1));
		customer.setCustomername(rs.getString(2));
		customer.setEmail(rs.getString(3));
		customer.setPassword(rs.getString(4));
		return customer;
	}
}
