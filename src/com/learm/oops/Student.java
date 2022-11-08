package com.learm.oops;

public class Student {
	Integer id;
	String name;
	Address address;
	public void addStudent(Integer id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
public void display() {
	System.out.println(name+" "+address.city+" "+ address.country);
}
public static void main(String[] args) {
	Address vivek=new Address("Allahbad", "UP", "India");
	Student vivek1=new Student();
	vivek1.addStudent(101, "Vivek",vivek);
	vivek1.display();
	
}

}
