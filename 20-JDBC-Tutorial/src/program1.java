import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Connection;
import java.sql.SQLException;

public class program1 {

     public static void main(String args[]) throws ClassNotFoundException,SQLException{
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
              String url="jdbc:mysql://localhost:3306/student";
              String username="root";
              String password="Singh@123";
    		// Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");
    		// System.out.println("Connection Established..."+conn);
              
              Connection conn=DriverManager.getConnection(url,username,password);
    		 
                  //1.Insert Query //
    		 PreparedStatement ps=conn.prepareStatement("INSERT INTO  studentinfo VALUES(?,?,?)");
    		 ps.setInt(1,136);
    		 ps.setString(2,"vandana");
    		 ps.setString(3,"rahli");		 
    		 int i=ps.executeUpdate();
    		 System.out.println("Data Inserted succesfully...");  
              
                  //2.Upadate Query//
              
//            PreparedStatement ps=conn.prepareStatement("update studentinfo set name=? ,address=? where id=?");
//            
//            ps.setString(1,"manjeet");
//            ps.setString(2,"Narsinghpur");
//            ps.setInt(3, 123);
//            
//            int i=ps.executeUpdate();
//            System.out.println("Data has been Updated....");
//            
              
              //3.Delete database //
              
//         PreparedStatement ps=conn.prepareStatement("delete from studentinfo where id=?");
//             ps.setInt(1,129);
//             
//             int i=ps.executeUpdate();
//             System.out.println("database delete successfully...");
              
              
              //4.show or display all database //
              
//        PreparedStatement ps=conn.prepareStatement("select *from studentinfo ");
//               ResultSet rs=ps.executeQuery();
//              // boolean f=rs.next();
//            //  System.out.println(f);
//            System.out.println("All database data: ");
//            System.out.println();
//             while(rs.next()) {
//            	  System.out.println("id = "+rs.getInt(1)+" name = "+rs.getString(2)+" address = "+rs.getString(3));
//             }
            		   
    		 conn.close();
    		 
    		
    	 }catch(SQLException  e){
    		 e.printStackTrace();
    	 }
     }

	private static String getString(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

