package com.demo.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlJdbcConnection {
	
	/*
	 * Step 1 – Import the Packages 
	 * Step 2 – Load the drivers using the forName() method
	 * Step 3 – Register the drivers using DriverManager 
	 * Step 4 – Establish a connection using the Connection class object 
	 * Step 5 – Create a statement 
	 * Step 6 – Execute the query 
	 * Step 7 – Close the connections
	 */

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/databaseName"; // table details
		String username = "username"; // MySQL credentials
		String password = "password";
		
		//step 2
		Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
		System.out.println("driver loaded");
		//step 3 && 4
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		//step 5
		Statement st = con.createStatement();
		//step 6
		String query = "select * from task_user"; // query to be run
		ResultSet rs = st.executeQuery(query); // Execute query
		while (rs.next()) {
			System.out.print(rs.getString("user_id") +  "  ");
			System.out.print(rs.getString("name")+  "  ");
			System.out.print(rs.getString("email"));
			System.out.println("===============================");
		}
		//step 7
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}

}
