package com.io.serial;

import java.io.Serializable;

public class Student implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 2L;
	private String studentName;
	private Integer studentId;
	private transient String department;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, Integer studentId, String department) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", department=" + department + "]";
	}

}
