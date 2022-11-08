package com.learm.oops;

public class HR extends Employee {
	
	Integer bonus=30000;
	Integer salary=bonus+basesalary;
	public static void main(String[] args) {
		HR vivek=new HR();
		System.out.println(vivek.salary);
		vivek.totalsalary(vivek.basesalary, vivek.bonus);
	}

}
