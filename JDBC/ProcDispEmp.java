package dbproj;

import java.sql.*;
import java.util.*;
public class ProcDispEmp {
	public static void main(String[] args) throws Exception{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","cmi");
				System.out.println("Connected..... "+con);
		Statement stmt = con.createStatement();
		CallableStatement c = con.prepareCall("{call empdisplay(?,?,?)}");
		c.registerOutParameter(1, java.sql.Types.VARCHAR);
		c.registerOutParameter(2, java.sql.Types.NUMERIC);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number inorder to get the details: ");
		int id = sc.nextInt();
		c.setInt(3,id);
		c.execute();
		String name = c.getString(1);
		String salary = c.getString(2);
		System.out.println("\t"+name+"\t"+salary);
		}
		catch(Exception e) {

		System.out.println(e);

		}
		} 	
}