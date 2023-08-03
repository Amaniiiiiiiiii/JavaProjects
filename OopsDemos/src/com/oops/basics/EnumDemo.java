package com.oops.basics;

enum Weekdays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumDemo {

	public static void main(String[] args) {

		Weekdays weekday=Weekdays.FRIDAY;
		//convert enum to string
		System.out.println(weekday.name());
		//to get index(ordinal) from enum starts from 0
		System.out.println(weekday.ordinal());
		//static method so call in static way
		Weekdays[] weekdaysArr=weekday.values();
		
		for(Weekdays weekdays:weekdaysArr) {
			System.out.println(weekdays.name());
		}
		System.out.println("Convert string to enum constant");
		weekday=Weekdays.valueOf("MONDAY");
		System.out.println(weekday);
	}

}
