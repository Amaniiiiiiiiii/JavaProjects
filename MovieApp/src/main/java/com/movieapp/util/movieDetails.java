package com.movieapp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class movieDetails {
	
	public List<String> showMovies(String language) {
		List<String> movies= new ArrayList<>();
		if(language.equals("Comedy")) {
			movies=Arrays.asList("Wheel of time","Avengers Endgame","Manifest");
		}
	    if(language.equals("Horror")) {
	    	movies=Arrays.asList("Rocky aur Rani","Hamari adhuri kahani","Shehzaada","Pathan");
	    }
	    if(language.equals("Scifi")) {
	    	movies=Arrays.asList("Hostel hugudare","RRR");
	    }
		return movies;
	}
     
}
