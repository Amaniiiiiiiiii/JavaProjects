package com.lumen.training;

public class SwitchDemo {
	public static void main(String[] args) {
		
		/*int x=10;
		int y=20;
		
		switch(x+y) {
		case 30:{
			System.out.println("Welcome");
		}
		break;
		case 40:{
			System.out.println("Hello");
		}
		default:{
			System.out.println("Great");
		}
		*/
		
		String choice="Monday";
		
		switch(choice){
		case "Monday":{}
		case "Tuesday":{}
		case "Wednesday":{}
		case "Thursday":{}
		case "Friday":{
			System.out.println("Weekday");
			break;
		}
		
		
		
		case "Saturday":{
			System.out.println("Weekend");
			break;
		}
		
		
		
		case "Sunday":{
			System.out.println("Rest day");
			break;
		}
		
		default: {
			System.out.println("Wrong choice");
		}
		
	}
	}
}


