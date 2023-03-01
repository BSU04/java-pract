package dbproj;

import java.sql.*;
import java.util.*;
public class PreparedStatementExample {
	   private static final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT5 VALUES (?,?,?,?)";
	   public static void main(String[] args ) {
	     Scanner scan = null;
	     int n = 0;
	     int stid= 0;
	     String name = null, address = null, city = null;
	     float avg = 0.0f;
	     String query = null;
	     Connection con = null;
	     PreparedStatement ps = null;
	     int result = 0;

	     try {
	    	 
	    	 Class.forName("oracle.jdbc.driver.OracleDriver"); //load the driver class 
	    	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");//create  the connection object 
	       
	        scan = new Scanner(System.in);
	        if(con != null) {
	           ps = con.prepareStatement(INSERT_STUDENT_QUERY);
	        }
	        
	     // take number of students
	        if(scan != null) {
	            System.out.print("Enter Number of students: ");
	            n = scan.nextInt();
	        }
	        
	        
	        if(scan != null && ps != null) {
	           for(int i=0; i<n; i++) {

	              
	              System.out.println("\nEnter Student-"+(i+1)+" details,");
	              System.out.print("Student ID: ");
	              stid = scan.nextInt();
	              System.out.print("Name: ");
	              name = scan.next();
	              System.out.print("Address: ");
	              address = scan.next();
	              System.out.print("City: ");
	              city = scan.next();
	              ps.setInt(1, stid);
	              ps.setString(2, name);
	              ps.setString(3, address);
	              ps.setString(4, city);

	              // execute the query
	              result = ps.executeUpdate();
	           }
	        }
	        
	        if(result == 0) {
	           System.out.println("\nRecords insertion failed");
	        } else {
	           System.out.println("\nRecords inserted successfully.");
	        }
	        
	        ResultSet rs=ps.executeQuery("select * from student5");  // change here too the student
	    	while(rs.next())  
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
	    	System.out.println("done");
	    		con.close(); 

	     } catch(SQLException se) {
	        se.printStackTrace();
	     } catch(Exception e) {
	        e.printStackTrace();
	     } // try-catch block 

	     finally {
	        // close JDBC objects
	        try {
	           if(ps != null) ps.close();
	        } catch(SQLException se) {
	           se.printStackTrace();
	        }
	        try {
	           if(con != null) con.close();
	        } catch(SQLException se) {
	           se.printStackTrace();
	        }
	        try {
	           if(scan != null) scan.close();
	        } catch(Exception e) {
	           e.printStackTrace();
	        }
	     } // finally
	   } // main()
	} // classx`
	
	