package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {
		Connection con = null;

		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kkr";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driverName);

			//open 
			con = DriverManager.getConnection(url,userName,password);
			System.out.println("dbconnected....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		getConnection();
	}

}
