package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection con;
	public static Connection createc() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username="root";
		String password="pass@word1";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		con=DriverManager.getConnection(url,username,password);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	}

}
