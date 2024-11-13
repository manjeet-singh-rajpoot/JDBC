
import java.sql.*;
import java.util.*;
public class program1 {
public static void main(String args[]) throws ClassNotFoundException,SQLException{
  
	  try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     String url="jdbc:mysql://localhost:3306/student";
             String username="root";
             String password="Singh@123";
             
             
             Connection conn=DriverManager.getConnection(url,username,password);
             
                     //1.Insert Key //
             
             Scanner s=new Scanner(System.in);
             System.out.println("Enter id : ");
             int id=s.nextInt();   
             System.out.println("Enter name: ");
             String name=s.next();
             
            System.out.println("Enter Address: ");
             String address=s.next();
             
             PreparedStatement ps=conn.prepareStatement("INSERT INTO studentinfo values(?,?,?)");
             ps.setInt(1, id);
             ps.setString(2,name);
             ps.setString(3,address);
              
             int a=ps.executeUpdate();
             
             System.out.println("Data Inserted successfully...");
             
             
                //2 Upadate key and value//
           
//           Scanner s1=new Scanner(System.in);
//           System.out.println("Enter name: ");
//             String name=s1.next();
//             
//           System.out.println("Enter id: ");
//           int id=s1.nextInt();
//           
//           System.out.println("Enter address: ");
//           String address=s1.next();
//           
//           PreparedStatement ps1=conn.prepareStatement("update studentinfo set name=?,address=? where id=? ");
//           ps1.setString(1, name);
//           ps1.setString(2, address);
//           ps1.setInt(3, id);
//           
//           int b=ps1.executeUpdate();
//           System.out.println("Data updated Successfully....");
             
             
             //3.Delete key and value //
             
//        Scanner s2=new Scanner(System.in);
//        System.out.println("Enter id : ");
//             int id=s2.nextInt();
//             
//        PreparedStatement ps3=conn.prepareStatement("delete from studentinfo where id =? ");
//             ps3.setInt(1, id);
//             
//           int c=ps3.executeUpdate();
             
        //     if(c==1) {
//           System.out.println("Data Deleted Successfully.....");
//             }else {
//            	 System.out.println("Data is not deleted..");
//             }
             
             //4.Fetch or Display key value //
             
//      Scanner s4=new Scanner(System.in);
//      System.out.println("Enter name: ");
//        String name=s4.next();
//        
//        
//        PreparedStatement ps4=conn.prepareStatement("select *from studentinfo where name=?");
//               ps4.setString(1, name);
//               
//               
//           ResultSet rs=ps4.executeQuery();
//           
//           
//           while(rs.next()) {
//        	   System.out.println("id: "+rs.getInt(1)+"\naddress: "+rs.getString(3));
//           }
             conn.close();
             
		     
		     
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
}
}
