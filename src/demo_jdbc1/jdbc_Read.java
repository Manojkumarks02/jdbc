package demo_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Read {
	public static void main(String[] args) {
		try {
			String url= "jdbc:mysql://localhost:3306/employee";
			String userName = "root";
            String password = "root1";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				
			}
			
			System.out.println("read from database");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
