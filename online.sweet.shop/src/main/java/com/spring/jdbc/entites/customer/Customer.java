package com.spring.jdbc.entites.customer;
//pojo
public class Customer {
	
	private int customerid;
	private String customername;
	private String email;
	private String password;
	public Customer(int customerid, String customername, String email, String password) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.email = email;
		this.password = password;
	}
	public Customer() {
		super();
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	

}
