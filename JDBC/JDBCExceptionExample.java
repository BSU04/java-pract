package dbproj;

import java.sql.*;
public class JDBCExceptionExample {
	public static void main(String[] args)throws Exception
	{
	try {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
	System.out.println("Connected..... "+con);
	Statement stmt=con.createStatement();
	System.out.println("\nEmployee Details");
	stmt.executeUpdate("select * from Employee where ename=Ram");
	}
	catch(SQLException e)
	{
	System.out.println("SQL Message : " +e.getMessage());
	System.out.println("SQL State : " +e.getSQLState());
	System.out.println("SQL Error code : " +e.getErrorCode());
	System.out.println("SQL Cause : " +e.getCause());
	}
	}
}