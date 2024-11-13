package com.beans;

import java.io.Serializable;

public class UserBean implements Serializable{

	private String UserId;
	private String UserName;
	private String accountNo;
	private String password;
	private double balance;
	
	       //setter //

	public void setUserId(String UserId) {
		this.UserId=UserId;
	}
	
	public void setUserName(String UserName) {
		this.UserName=UserName;
	}
	
	
	   //getter //
	public String getUserId() {
		return UserId;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	
}
