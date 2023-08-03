package com.voterapp.service;

import com.voterapp.exceptions.InvalidVoterException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NoVoterIdException;
import com.voterapp.exceptions.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {

	String[] localities= {"ShivajiNagar","FrazerTown","Indiranagar","BensonTown"};
	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InvalidVoterException {
		try {
			if(checkAge(age)&& checkLocality(locality)&&checkVoterId(voterId))
				return true;
		}catch(UnderAgeException e){
			System.out.println(e.getMessage());
		}catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(NoVoterIdException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
private boolean checkAge(int age) throws UnderAgeException{
	if(age<18) {
		throw new UnderAgeException("You are underage");
	}
	return true;
}
private boolean checkLocality(String locality) throws LocalityNotFoundException{
	boolean check=true;
	for(String locality1:localities) {
		if(locality1.equals(localities)) {
			check=false;
		}
	}
	if(check==false)
		throw new LocalityNotFoundException("Locality not found");
	return true;
}

private boolean checkVoterId(int vid)throws NoVoterIdException{
	if(vid<1000||vid>9999) {
		throw new NoVoterIdException("Voter does not Exist");
	}
	return true;
}
}
