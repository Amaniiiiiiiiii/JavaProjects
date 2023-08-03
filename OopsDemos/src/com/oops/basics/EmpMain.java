package com.oops.basics;

public class EmpMain {

	public static void main(String[] args) {
		// they are connected since object is being called with name of class of other file --->Employee this present file is EmpMain nd not employee next line is calling employee so its working for this to work both classes have to be within same package 
		 Employee employee = new Employee("Amani",101,5000);
//		 System.out.println(employee.empName); //null
//	 System.out.println(employee.empId);// 0
//		 employee.empName="Amani";
//		 employee.empId=10987;
//		 employee.salary=60000.0;
		 
		 employee.printDetails();
		 String result=employee.greet("great day ");
		 System.out.println(result);

		 
//		 System.out.println("Employee1 name "+employee.empName);
//		 System.out.println("Employee1 id "+employee.empId);
//		 System.out.println("Employee1 salary "+employee.salary);
//		 System.out.println(employee1.empName); //null
//		 System.out.println(employee1.empId);// 0
		 
		 
		 Employee employee1 = new Employee("Alpha",100,2000);
//		 employee1.empName="Alpha";
//		 employee1.empId=10989;
//		 employee1.salary=60500.0;
//		 System.out.println(employee1.greet("Welcome "));
		 
		 
		 
		 
		 
//		 
//		 System.out.println("Employee2 name "+employee1.empName);
//		 System.out.println("Employee2 id "+employee1.empId);
//		 System.out.println("Employee2 salary "+employee1.salary);
		 
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
	}

}
