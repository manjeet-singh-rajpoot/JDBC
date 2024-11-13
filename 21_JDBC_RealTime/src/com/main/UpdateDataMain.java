package com.main;
import com.conn.DBconnect;
import com.Dao.EmpDao;
import com.entity.*;
public class UpdateDataMain {
public static void main(String args[]) {
	
	Emp em=new Emp();
	em.setName("mr.Shiv singh");
	em.setAddress("Natwara");
	em.setId(126);
	em.setSalary(26000);
    EmpDao emd=new EmpDao(DBconnect.getconn());
    
    boolean f=emd.UpdateData(em);
    
    if(f) {
    	System.out.println("Data has Updated Successfully...");
    }else {
    	System.out.println("Error is Occured......");
    }
    
}
}
