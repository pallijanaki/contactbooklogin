package com.iberry.bean;

public class UserLogin {
	
	
	private String iduserlogin;
	private String password;
	
	public UserLogin(String iduserlogin, String password) {
		super();
		
		this.iduserlogin = iduserlogin;
		this.password = password;
	}
	
	
	public String getIduserlogin() {
		return iduserlogin;
	}
	public void setIduserlogin(String iduserlogin) {
		this.iduserlogin = iduserlogin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
