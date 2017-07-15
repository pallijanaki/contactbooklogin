package com.iberrylogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iberry.bean.UserLogin;
import com.mysql.jdbc.Statement;


public class userDAO {
	
	private static ResultSet rs;
	private static PreparedStatement pst;
	private static boolean status;
	private static Object us;
	public static Connection getConnection()
	{
	  String url="jdbc:mysql://localhost:3306/?";
		@SuppressWarnings("unused")
		String dbName="useridschema";
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String password="1234";
		java.sql.Connection conn=null;
		try
		{
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection(url,user,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		return(Connection)conn;
	}
	public static boolean validate(UserLogin user1)
	{
		
		try
		{
			
			Connection conn=userDAO.getConnection();
			pst = (PreparedStatement)conn.prepareStatement
			("Select * from useridschema.userLogin where iduserlogin=? and password=?");
			
			pst.setString(1,user1.getIduserlogin());
			pst.setString(2,user1.getPassword());
			rs = pst.executeQuery();
			status=rs.next();
			
			System.out.println(status);
			conn.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
	public static boolean add(UserLogin user1)
	{
		try
		{
			
			Connection conn=userDAO.getConnection();
			
			pst = (PreparedStatement)conn.prepareStatement
					("INSERT INTO useridschema.userlogin(iduserlogin,password) VALUES(?,?)");
				
			System.out.println(user1.getIduserlogin()+user1.getPassword());
					//pst.setString(1,"5");
					pst.setString(1,user1.getIduserlogin());
					pst.setString(2,user1.getPassword());
					
					 pst.executeUpdate();
					 
					//status=rs.next();
					//System.out.println(status);
			/*
			java.sql.Statement st= conn.createStatement();
			String qu="INSERT INTO userlogin(iduserlogin,password) VALUES(?,?)";
			st.setString(1,user1.)
			st.executeUpdate(qu);
			System.out.println(st.executeUpdate(qu));*/
			conn.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return true;
		
	}
}
