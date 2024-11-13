package com.main;
import com.conn.*;
import com.Dao.*;
import com.entity.*;
import java.util.*;
public class InsertDatabyTakingUserInput {
public static void main(String args[]) {
	EmpDao dao=new EmpDao(DBconnect.getconn());
	Emp em=new Emp();
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Emp id: ");
	int id=s.nextInt();
	
	System.out.println("Enter Emp Name: ");
	String name=s.next();
	
	System.out.println("Enter Emp Address: ");
	String address=s.next();
	
	System.out.println("Enter Salary: ");
	int salary=s.nextInt();
	
	em.setId(id);
    em.setName(name);
    em.setAddress(address);
    em.setSalary(salary);
    
    boolean f=dao.DataInsert(em);
    
    if(f) {
    	System.out.println("Data inserted successfully....");
    }else {
    	System.out.println("Error is Occured....");
    }
}
}
