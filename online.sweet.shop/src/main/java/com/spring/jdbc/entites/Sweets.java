package com.spring.jdbc.entites;
//pojo file for sweets
public class Sweets {
	
	private int sweetid;
	private String sweetsname;
	private int price;
	public Sweets(int sweetid, String sweetsname, int price) {
		super();
		this.sweetid = sweetid;
		this.sweetsname = sweetsname;
		this.price = price;
	}
	public Sweets() {
		super();
	}
	public int getSweetid() {
		return sweetid;
	}
	public void setSweetid(int sweetid) {
		this.sweetid = sweetid;
	}
	public String getSweetsname() {
		return sweetsname;
	}
	public void setSweetsname(String sweetsname) {
		this.sweetsname = sweetsname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Sweets [sweetid=" + sweetid + ", sweetsname=" + sweetsname + ", price=" + price + "]";
	}

}
