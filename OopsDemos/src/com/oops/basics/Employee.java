package com.oops.basics;

public class Employee {

	String empName; // if this is declared in psvm it will become local variable and their instances cant be called so declared above psvm
	int empId;
	double salary;
	
	public Employee(String empName,int empId, double salary){
		this.empName=empName;
		this.empId=empId;
		this.salary=salary;
		
	}
	
	void printDetails() {
	 System.out.println("Employee name "+empName);
	 System.out.println("Employee id "+empId);
	 System.out.println("Employee salary "+salary);
	}
	
	String greet(String msg) {
		return msg+empName;
	}
//	public static void main(String[] args) {
//	
//		 Employee employee = new Employee();
//		 System.out.println(employee.empName); //null
//		 System.out.println(employee.empId);// 0
//		 employee.empName="Amani";
//		 employee.empId=10987;
//		 employee.salary=60000.0;
//		 
//		 System.out.println("Employee1 name "+employee.empName);
//		 System.out.println("Employee1 id "+employee.empId);
//		 System.out.println("Employee1 salary "+employee.salary);
//		
//		 Employee employee1 = new Employee();
//		 System.out.println(employee1.empName); //null
//		 System.out.println(employee1.empId);// 0
//		 employee1.empName="Alpha";
//		 employee1.empId=10989;
//		 employee1.salary=60500.0;
//		 
//		 System.out.println("Employee2 name "+employee1.empName);
//		 System.out.println("Employee2 id "+employee1.empId);
//		 System.out.println("Employee2 salary "+employee1.salary);
//		 
//		 Employee employee2=employee;//new reference pointing to same object 
//		 System.out.println("Employee2 name "+employee2.empName);
//		 employee2.empName="Raj";
//		 System.out.println("Employee2 name "+ employee2.empName);
//		 System.out.println("Employee1 name "+ employee.empName);
//		 
//		 //make employee null
//		 employee=null;
//		 System.out.println("Employee2 name "+ employee2.empName);
//		 System.out.println("Employee1 name "+ employee.empName);
//	}

}
