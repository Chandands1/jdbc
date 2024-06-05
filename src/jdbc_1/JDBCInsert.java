package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		try {
			
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "*");
			 
			    Statement statement = connection.createStatement();
			    
			    statement.executeUpdate("insert into registration values('harshith','pandavapura','harshith@gmail.com','0088995566')");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
