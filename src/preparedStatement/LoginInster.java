package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginInster {
	
	public static void main(String[] args) {
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", "*");
			
			PreparedStatement ps = connection.prepareStatement("insert into login values(?,?)");
			
			ps.setString(1, "rahul");
			ps.setString(2, "321");
			ps.executeUpdate();
			connection.close();
			
		} catch (Exception e) {
			
		}
	}

}
