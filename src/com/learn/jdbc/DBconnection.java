package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	Connection con;
	public void createc() {
	try {
		Class.forName("com.mysql.jdbc.driver");
		String username="root";
		String password="pass@word1";
		String url="http://localhost:3306/studentinfo";
		con=DriverManager.getConnection(url,username,password);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
