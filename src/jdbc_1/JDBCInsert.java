package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		try {
			
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "*");
			 
			    Statement statement = connection.createStatement();
			    
			    statement.executeUpdate("insert into registration values('chandan','mandya','chandan@gmail.com','9008531478')");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
