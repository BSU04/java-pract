package dbproj;

import java.sql.*;
public class TransactionManagementExample {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
			System.out.println("Connected..... "+con);
		
		Statement stmt = con.createStatement();
		con.setAutoCommit(false);
		System.out.println("Auto commit is set to false.");
		ResultSet rs =stmt.executeQuery("select * from Department");
		System.out.print("\nTable data before insertion ->\n\t");
		while(rs.next()) {
		System.out.print(rs.getInt(1) + "\t"+
		rs.getString(2)+"\t" +
		rs.getString(3)+"\n\t");
		}
		
		System.out.print("\nTable data after insertion -> \n\t");
		stmt.executeUpdate("insert into Department values(4,'MSCDA','Thrissur')");
		rs =stmt.executeQuery("select * from Department");
		while(rs.next()) {
		System.out.print(rs.getInt(1) + "\t"+
		rs.getString(2)+"\t" +
		rs.getString(3)+"\n\t");
		}
		
		con.rollback();
		System.out.print("\nTable data after rollback ->\n\t");
		rs =stmt.executeQuery("select * from Department");
		while(rs.next()) {
		System.out.print(rs.getInt(1) + "\t"+
		rs.getString(2)+"\t" +
		rs.getString(3)+"\n\t");
		}
		}
		catch(Exception e) {

		System.out.println(e);

		}
		}

}