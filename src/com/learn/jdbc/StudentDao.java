package com.learn.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
 public static void addStudent(Student st) {
	 try {
		 Connection con= DBconnection.createc();
		 String query="insert into student(sname,phone,scity) values(?,?,?)";
		 PreparedStatement pstm= con.prepareStatement(query);
		 pstm.setString(1,st.getSname());
		 pstm.setString(2,st.getSphone());
		 pstm.setString(3,st.getScity());
		 int cnt=pstm.executeUpdate();
		 if(cnt!=0)
			 System.out.println("successful");
	 }
	 catch(Exception e){
		 e.printStackTrace();
		 
	 }
	 
 }
 public static void deleteStudent(int i) {
	 try {
		 Connection con= DBconnection.createc();
		 String query="DELETE FROM student WHERE sid=?;";
		 PreparedStatement pstm= con.prepareStatement(query);
		 pstm.setInt(1,i);
		 
		 int cnt=pstm.executeUpdate();
		 if(cnt!=0)
			 System.out.println("successful");
	 }
	 catch(Exception e){
		 e.printStackTrace();
		 
	 }
	 
 }
 public static void showAllStudent() {
	 try {
		 Connection con= DBconnection.createc();
		 String query="select * from student";
		 Statement stmt=con.createStatement();
		 ResultSet set=stmt.executeQuery(query);
		 while(set.next()) {
			 int id=set.getInt(1);
			 String name=set.getString(2);
			 String phone=set.getString(3);
			 String city=set.getString(4);
			 System.out.println("ID:"+id);
			 System.out.println("Student name:"+name);
			 System.out.println("Student Phone:"+phone);
			 System.out.println("City:"+city);
			 }
		
	 }
	 catch(Exception e){
		 e.printStackTrace();
		 
	 }
	 
 }
	
}
