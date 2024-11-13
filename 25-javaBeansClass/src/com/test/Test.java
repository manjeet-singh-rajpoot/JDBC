package com.test;
import com.beans.*;
public class Test {
public static void main(String args[]) {
	UserBean user=new UserBean();
	   user.setUserId("100");
	   user.setUserName("manjeet Singh ");
	   
	   System.out.println("UserId is: "+user.getUserId());
	   System.out.println("name is : "+user.getUserName());
	
}
}
