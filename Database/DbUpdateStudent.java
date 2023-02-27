package dbproj;

import java.io.*;
import java.sql.*;
public class DbUpdateStudent {
	public static void main(String args[])
	{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
	System.out.println("Connected..... "+con);
	PreparedStatement stmt=con.prepareStatement("update student5 set city=? where no=?");

	String city1 = "Kochi";
	int stuid=101;
	stmt.setInt(2,stuid);
	stmt.setString(1,city1);
	stmt.executeUpdate();
	System.out.print("\nRecord Updated");
	con.close();
	}
	catch(Exception e) {
	System.out.println(e);
	}
	}
}