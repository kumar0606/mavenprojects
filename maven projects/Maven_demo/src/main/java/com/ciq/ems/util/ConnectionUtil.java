package com.ciq.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection connection = null;
	private static Statement ps = null;
	private static ResultSet rs = null;
	private static Properties Pro = null;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Pro = new Properties();
			Pro.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.Properties"));
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/joins ","root","Ravi@1999");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;

	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeStatement() {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeResultSet() {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
