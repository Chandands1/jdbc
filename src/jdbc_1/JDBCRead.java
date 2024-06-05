package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCRead {
	public static void main(String[] args) {
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "*");
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery("select * from registration");
			
			while(result.next()) {
				System.out.print(result.getString(1)+' ');
				System.out.print(result.getString(2)+' ');
				System.out.print(result.getString(3)+' ');
				System.out.print(result.getString(4));
				System.out.println(" ");

			}
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
