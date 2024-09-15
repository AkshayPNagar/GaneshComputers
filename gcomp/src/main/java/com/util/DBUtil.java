package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil extends Object {
	
	private static final String URL="jdbc:mysql://localhost:3306/akshay";
	private static final String USERNAME="root";
	private static final String PASSWORD="Pass@1234";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
	}
	
	
}
