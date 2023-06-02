package demo_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Delete {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/employee";
			String username = "root";
			String password = "root1";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username , password);
			
			Statement st = con.createStatement();
			st.executeUpdate( "delete from student where id = '2'");
			st.close();
			System.out.println("deleted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
