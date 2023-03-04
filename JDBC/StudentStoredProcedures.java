package dbproj;

import java.io.*;
import java.sql.*;
import java.util.*;

public class StudentStoredProcedures {
	public static void main(String args[]){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
		System.out.println("Connected..... "+con);
		CallableStatement stmt=con.prepareCall("{call studentinsert(?,?,?,?)}");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student No : ");
		int no=Integer.parseInt(input.nextLine());
		System.out.print("Enter Student Name : ");
		String name=input.nextLine();
		System.out.print("Enter Address : ");
		String address=input.nextLine();
		System.out.print("Enter City : ");
		String city=input.nextLine();
		
		stmt.setInt(1,no);
		stmt.setString(2,name);
		stmt.setString(3,address);
		stmt.setString(4,city);
		
		stmt.execute();
		System.out.println("Record Inserted");
		con.close();
		}
		catch(Exception e) {

		System.out.println(e);

		}
		}


}