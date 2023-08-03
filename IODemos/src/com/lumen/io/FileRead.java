package com.lumen.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
public static void main(String[] args) {
	
	InputStreamReader reader= new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(reader);
	FileWriter fileWriter=null;
	try {
		fileWriter =new FileWriter("demo.txt");
		
		String value=bufferedReader.readLine();
		fileWriter.write("Hello Amani.How are you?");
//		System.out.println(value);
		do {
			System.out.println(value);
			value=bufferedReader.readLine();
		}while (!value.equals("stop"));
			
	}
	catch(IOException e){
		e.printStackTrace();
	}
	finally {
		try {
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
