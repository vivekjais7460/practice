package com.learm.oops;
public class Dev extends Employee {
     Integer bonus=30000;
     Integer salary=bonus+ basesalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dev vivek=new Dev();
          System.out.println(vivek.salary);
	}

}
