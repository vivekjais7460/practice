package com.learm.oops;
public class Employee{
	Integer basesalary=250000;
	public void totalsalary(Integer bs,Integer bonus) {
		Integer total=bs+bonus;
		System.out.println(total);
	}
	public void totalsalary(Integer bs,Integer bonus,Integer insentive) {
		Integer total=bs+bonus+insentive;
		System.out.println(total);
	}
	public void working() {
		System.out.println("Empolyee is working");
	}
}

