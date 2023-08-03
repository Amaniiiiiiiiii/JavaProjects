package com.lumen.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
//create an object of BufferedReader
		//create an object for converting bytes to characters
		InputStreamReader reader= new InputStreamReader(System.in);
		//create an object of bufferedReader
		BufferedReader bufferedReader=new BufferedReader(reader);
		String value;
		
		try {
			value = bufferedReader.readLine();
		System.out.print(value);
		while(value.equals("stop")) {
			value=bufferedReader.readLine();
			System.out.println(value);
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
