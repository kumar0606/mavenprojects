package coonection_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionutil {
	 static Connection c=null;
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/joins ", "root", "Ravi@1999");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 
public static Connection getConnection() {
	return c;
	
}
public static void main(String[] args) {
	System.out.println( getConnection());
}
}