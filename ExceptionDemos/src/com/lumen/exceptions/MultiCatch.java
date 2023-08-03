package com.lumen.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
			String value = args[0];
			System.out.println("Value " + value);
			int num = Integer.parseInt(value);
			System.out.println("Number " + num);
			int result = 100 / num;
			System.out.println(result);
			int[] nums=null;
			System.out.println(nums[0]);
		}
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException |NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter a number");
		}
		
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
//			System.out.println("Dont enter 0");
		}
		
//		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Please enter a number");
//		}
		
		catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());

		}
		System.out.println("Completed");
	}

}
