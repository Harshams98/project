package com.spring.jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Sweets;

public class RowMapImplSweets implements RowMapper<Sweets>{

	public Sweets mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Sweets sweet=new Sweets();
		sweet.setSweetid(rs.getInt(1));
		sweet.setSweetsname(rs.getString(2));
		sweet.setPrice(rs.getInt(3));
		return sweet;
	}
}
