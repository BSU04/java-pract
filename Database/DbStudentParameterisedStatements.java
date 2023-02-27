package dbproj;

import java.io.*;
import java.sql.*;
public class DbStudentParameterisedStatements {
	public static void main(String args[])
	{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
	System.out.println("Connected..... "+con);
	PreparedStatement stmt=con.prepareStatement("select * from student5 where name like ?");

			String name="A%";
			stmt.setString(1,name);
			System.out.print("\nDisplaying Students whose name starts with 'A' ->\n\t");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
			System.out.print(rs.getInt("no")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("Address")+" ");
			System.out.print(rs.getString("City")+" ");
			System.out.print("\n\t");
			}
			con.close();
			}
			catch(Exception e) {
			System.out.println(e);
			}
			}
}