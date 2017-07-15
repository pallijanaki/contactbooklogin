package com.iberry.dao.contactbookdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iberry.bean.UserLogin;
import com.iberry.bean.contactbook;
import com.iberrylogin.dao.userDAO;

public class contactDao {
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
	public static boolean validate(contactbook contact)
	{
		
		try
		{
			
			Connection conn=userDAO.getConnection();
			pst = (PreparedStatement)conn.prepareStatement
			("insert into useridschema.contactbook(name,dob,website,address,telno,companyname,landlineno) values(?,?,?,?,?,?,?)");
			
			pst.setString(1,contact.getName());
			pst.setString(2,contact.getAddress());
			pst.setString(2,contact.getWebsite());
			pst.setString(2,contact.getDob());
			pst.setString(2,contact.getTelno());
			pst.setString(2,contact.getLandlineno());
			pst.setString(2,contact.getCompanyname());
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

}
