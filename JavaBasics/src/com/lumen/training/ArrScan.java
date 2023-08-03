package com.lumen.training;

import java.util.Scanner;

public class ArrScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks=new int[4];
		Scanner scanner= new Scanner(System.in);
		
		for (int i=0;i<4;i++)
		{ System.out.println("Enter Values");
		
			marks[i]=scanner.nextInt();
		}//int[] mairks= new int[]{40,50,60}
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		System.out.println("Sum of array is "+sum);
		scanner.close();
	}
	//shift+ctrl+O for import 

}
