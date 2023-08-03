package com.oops.inher;

public class InManager extends InEmployee {
	double salary;
	public InManager(String name, int employeeId, double salary) {//created using contentAssist
		super(name, employeeId);
		this.salary=salary;
		
	}
	void printBonus(double amount) {
		System.out.println(salary+amount);
		
	}
}
