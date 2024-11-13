package com.conn;
import java.sql.*;

public class DBconnect {
	
	
   private static Connection conn;

  public static Connection getconn() {
	try {
		if(conn==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Singh@123");
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	 return conn;
}
}
