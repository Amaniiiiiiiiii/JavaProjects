package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exceptions.InvalidVoterException;
import com.voterapp.service.ElectionBoothImpl;

public class VoterMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		System.out.println("Enter your locality");
		String locality=scanner.next();
		System.out.println("Enter your voter id");
		int voterId=scanner.nextInt();
		
		ElectionBoothImpl electionBoothImpl=new ElectionBoothImpl();
		try{
			if(electionBoothImpl.checkEligibility(age,locality,voterId))
					System.out.println("You're elegible to vote");
		}catch(InvalidVoterException e){
			System.out.println(e.getMessage());
			
			
		}
	}

}
