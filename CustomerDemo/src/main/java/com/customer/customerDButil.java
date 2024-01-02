package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDButil {

	public static List<Customer> validate (String userName, String password){
		
		ArrayList <Customer> cus = new ArrayList<Customer>(); // <Customer> this main what's the list return just name
		
		//create database connection
		
		String url = "jdbc:mysql://localhost:3306/testdatabase";
		String user = "root";
		String pass = "Iresh542371";
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt = con.createStatement(); // Statement is a built in class
			
			String sql = " select * from where customer_username = '"+userName+"' and customer_password = '"+password+"'";
			
			ResultSet rs = stmt.executeQuery(sql); // ResultSet is a built in class
			
			if (rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String nameUser = rs.getString(4);
				String Userpass = rs.getString(5);
				
				Customer cust = new Customer(id,name,email,nameUser,Userpass);
				cus.add(cust); // for return 
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	} 
	
}
