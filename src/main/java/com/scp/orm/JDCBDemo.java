package com.scp.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDCBDemo {
	
	public static void main(String[] args) {
			
		try {
			Class.forName(""); // database 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection conn  = DriverManager.getConnection("","","");
			Statement stmt = conn.createStatement();
			stmt.execute("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
