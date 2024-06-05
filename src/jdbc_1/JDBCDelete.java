package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDelete {
	
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the name");
			
			String name = input.next();
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "*");
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("DELETE FROM registration WHERE name = '"+name+"'");
			connection.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
