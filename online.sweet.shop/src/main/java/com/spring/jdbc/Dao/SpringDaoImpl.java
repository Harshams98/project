package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Admin;
import com.spring.jdbc.entites.Sweets;


@Component("sweetDao")
public class SpringDaoImpl implements SweetDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Admin getAdmin(String username, String password) {
		String query="Select * from admin where username=? && password=?";
		RowMapper<Admin> rowMapper=new RowMapperImpl();
		Admin admin =this.jdbcTemplate.queryForObject
				(query,rowMapper, username,password);
		return admin;
	
	}
	public List<Sweets> getAllSweets() {
		String query="select * from sweets";
		List<Sweets> sweets=this.jdbcTemplate.query(query, new RowMapImplSweets());
		return sweets;
	}
	
	//Override -- abstract from the interface -- display the inserted entities.
	
	//the insert sql query supported to executed here.
    //insert query
	public int insert(Sweets sweet) {
		
	        String query="insert into sweets (sweetsname,price) values(?,?)";
	        int r=this.jdbcTemplate.update(query,
	        		sweet.getSweetsname(),sweet.getPrice());
		
		return r;
	}
	public int delete(int sweetId) {
		
		// delete the data
				String query="delete from sweets where sweetid=?";
				int r=this.jdbcTemplate.update(query, sweetId);
				return r;
	}
	public int update(Sweets sweet) {
		//Updating data
				String query="update sweets set price=? where sweetid=?";
				 int r=this.jdbcTemplate.update(query,sweet.getPrice(),sweet.getSweetid());
				return r;
	}
	public Sweets getSweet(String sweetname) {
		String query="Select * from sweets where sweetsname=?";
		RowMapper<Sweets> rowMapper=new RowMapImplSweets();
		Sweets sweet =this.jdbcTemplate.queryForObject
				(query,rowMapper, sweetname);
		return sweet;
	}
	
	
	
	

}
