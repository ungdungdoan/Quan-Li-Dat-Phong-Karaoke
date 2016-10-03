package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect_database {

	public static Connect_database instance = new Connect_database();
	private Connection con = null;
	
	public void Connect() {
		
		if(con!=null)
			return;
		try {
			String url = "jdbc:sqlserver://localhost:1433;databasename =dbKaraoke";
			con = DriverManager.getConnection(url,"sa","123");
			System.out.println("Database is open....!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
				
		try {
			if(con!=null)
				con.close();
			System.out.println("Database is close..!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getconnect() {
		Connect();
		return con;
	}
	
	public static Connect_database get_instance() {
		return instance;
	}
	
	public static void main(String[] args) {
		new Connect_database().Connect();
	}
	
}
