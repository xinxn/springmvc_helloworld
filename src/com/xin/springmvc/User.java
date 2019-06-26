package com.xin.springmvc;

public class User {

	private String username1;

	private String password1;

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username1 = username;
		this.password1 = password;
	}

	public String getUsername() {
		return username1;
	}

	public void setUsername(String username) {
		this.username1 = username;
	}

	public String getPassword() {
		return password1;
	}

	public void setPassword(String password) {
		this.password1 = password;
	}

	@Override
	public String toString() {
		return "User [username1=" + username1 + ", password1=" + password1 + "]";
	}

	

}
