package com.main;
//import java.sql.*;
import com.conn.DBconnect;
import com.Dao.EmpDao;
import com.entity.*;
public class insertDataMain {
	
public static void main(String args[]) {
	   Emp em=new Emp();
	   em.setId(191);
	   em.setName("Poonam");
	   em.setAddress("Jabalpur");
	   em.setSalary(25000);
	   
	   EmpDao dao=new EmpDao(DBconnect.getconn());
	   boolean f=dao.DataInsert(em);
	   
	   if(f) {
		   System.out.println("Data inserted Succesfully...");
	   }else {
		   System.out.println("Somthing Wrong....");
	   }
	   
}
}
