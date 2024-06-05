package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = input.next();
			
			System.out.println("Enter your city");
			String city = input.next();
			
			System.out.println("Enter your email");
			String email = input.next();
			
			System.out.println("Enter you phone number");
			 String mobile = input.next();
			
			 Connection connection = DriverManager.getConnection
					 ("jdbc:mysql://localhost:3306/db1", "root", "*");
			 
			    Statement statement = connection.createStatement();
			    
			    statement.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
