package com.io.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentName("Amani");
		student.setStudentId(10);
		student.setDepartment("CSE");
		
		//serialize
		try(FileInputStream fileInputStream=new FileInputStream("stud.ser");
				ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);){
			     Student student1 =(Student)objectInputStream.readObject();
			     System.out.println(student1);
			    // Emp emp=(Emp)objectInputStream.readObject();
			     
		System.out.println();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
