package com.exam.twitter.models;

import java.util.List;

public class User {

	private String username;
	private String password;
	private List<Category> category;
	
	
	public User() {
		
	}
	
	public User(String username, String password, List<Category> category) {
		super();
		this.username = username;
		this.password = password;
		this.category = category;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", category=" + category + "]";
	}
	
	
}
