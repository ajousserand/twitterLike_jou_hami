package com.exam.twitter.models;

import java.util.List;

public class LocalUser {

	private Integer id;
	private String username;
	private String password;
	private List<Category> category;
	private String role;
	
	
	public LocalUser() {
		
	}
	
	public LocalUser(String username, String password,  String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ",  ]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}
	
	
}
