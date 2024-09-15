package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class sendDao {

	private String dburl="jdbc:mysql://localhost:3306/akshay";
	private String dbuname="root";
	private String dbpassword="Pass@1234";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver( String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
	}

	
	public Connection getConnection()
{
		Connection con=null;
		try {
		con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		}
	
		public String insert(Member member)
		{
			loadDriver(dbdriver); 
			Connection con=getConnection();
			String result="Data Entered Successfully";
			String sql="insert into akshay.member values(?,?,?,?,?)";
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, member.getName());
				ps.setString(2, member.getMobile());
				ps.setString(3, member.getEmail());
				ps.setString(4, member.getSubject());
				ps.setString(5, member.getMessage());
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result="Data not entered";
			}
			
			return result;
		}
	}
