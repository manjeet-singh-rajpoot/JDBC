package com.Dao;
import java.sql.*;
import com.entity.Emp;
import java.util.*;
public class EmpDao {
private Connection conn;

public EmpDao(Connection conn) {
	super();
	this.conn = conn;
}
     public boolean DataInsert(Emp emp) {
    	 boolean f=false;
    	 try {
    		 PreparedStatement ps=conn.prepareStatement("insert into emp values(?,?,?,?)");
    		 ps.setInt(1,emp.getId());
    		 ps.setString(2,emp.getName());
    		 ps.setString(3,emp.getAddress());
    		 ps.setInt(4,emp.getSalary());
    		 
    		 int a=ps.executeUpdate();
    		 
    		 if(a==1) {
    			 f=true;
    		 }
    		 
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
    	 
    	 return f;
     }

     public boolean UpdateData(Emp em) {
    	 
    	 boolean f=false;
    	 
    	 try {
    		 
    		 PreparedStatement ps=conn.prepareStatement("UPDATE emp2 set address=?,name= ?,salary=? where id=?");
    		  ps.setString(1,em.getAddress());
    		  ps.setString(2,em.getName());
    		  ps.setInt(3,em.getSalary());
    		  ps.setInt(4,em.getId());
    		  
    		 int i=ps.executeUpdate();
    		 
    		 if(i==1) {
    			 f=true;
    		 }
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 return f;
    	 
     }
     
     public boolean DeleteData(int id) {
    	   boolean f=false;
    	   
    	   try {
    		   
    		   PreparedStatement ps=conn.prepareStatement("delete from emp where id=?");
    		   ps.setInt(1, id);
    		   
    		   int i=ps.executeUpdate();
    		   
    		   if(i==1) {
    			   f=true;
    		   }
    		   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   
    	   return f;
     }
     
     
public Emp displayData(int id) {
    	 
    	 Emp obj=null;
    	 
    	 try {
    		 
    		 PreparedStatement ps=conn.prepareStatement("select *from emp where id=? ");
    		 ps.setInt(1, id);
    		 
    		 ResultSet rs=ps.executeQuery();
    		 
    		 while(rs.next()) {
    			 obj=new Emp();
    			 obj.setId(rs.getInt(1));
    			 obj.setName(rs.getNString(2));
    			 obj.setAddress(rs.getString(3));
    			 obj.setSalary(rs.getInt(4));
    			 
    		 }
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    	 return obj;
     }
     
public List<Emp> DisplayAllData(){
	List<Emp>list=new ArrayList<Emp>();
	Emp em=null;
	 
	
	   try {
		       PreparedStatement ps=conn.prepareStatement("select *from emp ");
		       
		       ResultSet rs=ps.executeQuery();
		       
		       while(rs.next()) {
		    	   em=new Emp();
		    	   em.setId(rs.getInt(1));
		    	   em.setName(rs.getString(2));
		    	   em.setAddress(rs.getString(3));
		    	   em.setSalary(rs.getInt(4));
		    	   list.add(em);
		    	   
		       }
		       
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	
	return list;
}
     
}
