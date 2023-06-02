package demo_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_Create {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root1");
		Statement st = con.createStatement();
		st.executeUpdate("insert into student values('8', 'sehwag', 'sehwag@mail.com')");
		con.close();
		System.out.println("inserted");

	}
}
