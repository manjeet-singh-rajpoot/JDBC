package com.main;
import com.conn.*;
import com.Dao.*;
import com.entity.*;
import java.util.*;
public class DisplayAllData {
 public static void main(String args[]) {
	 EmpDao dao=new EmpDao(DBconnect.getconn());
	 
	 List<Emp>list=dao.DisplayAllData();
	 
	 for(Emp e:list) {
		 System.out.println("id: "+e.getId());
		 System.out.println("Name: "+e.getName());
		 System.out.println("Address: "+e.getAddress());
		 System.out.println("Salary: "+e.getSalary());
		 System.out.println(".................................");
	 }
 }
}
