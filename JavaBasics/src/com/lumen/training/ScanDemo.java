package com.lumen.training;
import java.util.Scanner;
public class ScanDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details");
		System.out.println("Enter name");
		String name = scanner.nextLine();
		
		System.out.println("Name "+ name);
		System.out.println("Enter id");
		int id=scanner.nextInt();
		System.out.println("id "+ id);
		scanner.nextLine();
		System.out.println("Enter city");
		String city=scanner.nextLine();
		System.out.println("City "+city);
		System.out.println("Enter salary");
		double salary=scanner.nextDouble();
		System.out.println("Salary "+salary);
		scanner.close();
		
	}

}
