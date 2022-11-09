package com.learn.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("press 2 to delete a student ");
		    System.out.println("press 3 to display all usesr");
		    System.out.println("press 4 to exit");
		    int choice=Integer.parseInt(br.readLine());
		    if(choice==1) {
		    	System.out.println("Enter Name= ");
		    	String name=br.readLine();
		    	System.out.println("Enter Student phone number= ");
		    	String phone=br.readLine();
		    	System.out.println("Enter Student City");
		    	String city=br.readLine();
		    	Student st=new Student(name,phone,city);
		    	System.out.println(st);
		    	StudentDao.addStudent(st);
		          
		    }
		    else if(choice==2) {
		    	System.out.println("Enter student Id to be deleted");
		    	int studentid=Integer.parseInt(br.readLine());
		    	StudentDao.deleteStudent(studentid);
		    	
		    }
		    else if(choice==3) {
		    	StudentDao.showAllStudent();
		    	
		    }
		    else if(choice==4) {
		    	
		    }
		    else {
		    	
		    }
		    
		    System.out.println("Thanks for using the Student Application");
		    	
		}
		

	}

}
