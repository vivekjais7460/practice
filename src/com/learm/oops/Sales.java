package com.learm.oops;

public class Sales extends Employee {
	
	Integer bonus=30000;
	Integer insentive;
	public static void main(String[] args) {
		Sales vivek=new Sales();
		vivek.insentive=30000;
		vivek.totalsalary(vivek.basesalary, vivek.bonus,vivek.insentive);
		vivek.working();
	}

}
