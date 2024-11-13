import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Connection;
import java.sql.SQLException;

public class program1 {

     public static void main(String args[])throws ClassNotFoundException,SQLException {
    	
			  Class.forName("com.mysql.cj.jdbc.Driver");
              String url="jdbc:mysql://localhost:3306/student";
              String username="root";
              String password="Singh@123";
    		// Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");
    		// System.out.println("Connection Established..."+conn);
              
              Connection conn=DriverManager.getConnection(url,username,password);
    		 
    		 PreparedStatement ps=conn.prepareStatement("INSERT INTO  studentInfo VALUES(?,?,?)");
    		 ps.setInt(1,121);
    		 ps.setString(2,"manjeet");
    		 ps.setString(3,"shahpura");
    		 
    		 int i=ps.executeUpdate();
    		 System.out.println("Data Inserted succesfully...");   
    		 conn.close();
    		 
    		
    	
     }
}

