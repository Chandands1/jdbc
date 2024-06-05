package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdate {
	
	public static void main(String[] args) {
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "*");
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("UPDATE registration SET city = 'mumbai' WHERE name = 'mike'");
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
