package com.main;
import com.conn.*;
import com.Dao.*;
import com.entity.*;
public class DisplaySingleData {
public static void main(String args[]) {
	EmpDao dao=new EmpDao(DBconnect.getconn());
	  Emp em=dao.displayData(190);
	  
	 if(em==null) {
		 System.out.println("User is Not availabele..");
	 }else {
		 System.out.println("Name : "+em.getName());
		  System.out.println("Address: "+em.getAddress());
		  System.out.println("Salary: "+em.getSalary()); 
		  
	 }	
}
}
