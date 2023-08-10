package com.employeeapp.model;

public class Employee {

private String employeeName;
private int employeeId;
private String city;
private double salary;
private String Department;
private String[] Hobbies;







@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", city=" + city + ", salary="
			+ salary + ", Department=" + Department + ", Hobbies=" + Hobbies + "]";
}







public String getEmployeeName() {
	return employeeName;
}







public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}







public int getEmployeeId() {
	return employeeId;
}







public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}







public String getCity() {
	return city;
}







public void setCity(String city) {
	this.city = city;
}







public double getSalary() {
	return salary;
}







public void setSalary(double salary) {
	this.salary = salary;
}







public String getDepartment() {
	return Department;
}







public void setDepartment(String department) {
	Department = department;
}







public String[] getHobbies() {
	return Hobbies;
}







public void setHobbies(String[] hobbies) {
	Hobbies = hobbies;
}







public Employee(String employeeName, int employeeId, String city, double salary, String department, String[] hobbies) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.city = city;
	this.salary = salary;
	Department = department;
	Hobbies = hobbies;
}







public Employee() {
	super();
	// TODO Auto-generated constructor stub
}




	
	
	

}
