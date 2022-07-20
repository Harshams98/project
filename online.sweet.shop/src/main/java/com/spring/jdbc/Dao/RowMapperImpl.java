package com.spring.jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Admin;

public class RowMapperImpl implements RowMapper<Admin>{

	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Admin admin=new Admin();
		admin.setUsername(rs.getString(1));
		admin.setPassword(rs.getString(2));

		return admin;
	}
	
	
}