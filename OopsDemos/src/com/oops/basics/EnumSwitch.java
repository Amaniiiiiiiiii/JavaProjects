package com.oops.basics;

import java.util.Scanner;

enum Seasons {
	SUMMER, WINTER, RAINY,AUTUMN;


}

public class EnumSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toUpperCase();
		
		Seasons seasons = Seasons.valueOf(input);
		
		switch(seasons) {
		case SUMMER:
			System.out.println("Very hot. eat ice cream");
			break;
		case WINTER:
			System.out.println("Drink hot tea");
			break;
		case RAINY:
			System.out.println("Drink soup");
			break;
		case AUTUMN:
			System.out.println("gO OUT AND ENJOY");
			break;
		}
	}

}
