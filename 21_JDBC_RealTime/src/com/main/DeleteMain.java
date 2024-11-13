package com.main;
import com.Dao.*;
import com.conn.DBconnect;
public class DeleteMain {
  public static void main(String args[]) {
	  
	  EmpDao dao=new EmpDao(DBconnect.getconn());
	   boolean f=dao.DeleteData(191);
	    
	   if(f) {
		   System.out.println("Data Deleted successfully....");
	   }else {
		   System.out.println("Error is Occured...");
	   }  
  }
}
