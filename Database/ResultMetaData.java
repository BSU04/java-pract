package dbproj;

import java.sql.*;  
public class ResultMetaData {
	public static void main(String args[]){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
		  
		  
		PreparedStatement ps=con.prepareStatement("select * from student5");  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData(); //additional syntax 
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
		
		System.out.println("Column Name of 2nd column: "+rsmd.getColumnName(2));  
		System.out.println("Column Type Name of 2nd column: "+rsmd.getColumnTypeName(2));
		  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}