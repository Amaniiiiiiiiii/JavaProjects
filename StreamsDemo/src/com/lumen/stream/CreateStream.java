package com.lumen.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {

		//create stream from array
		String[] names=new String[] {"Amani","Alpha","Beta","Gamma"};
		Stream.of(names).forEach(name->System.out.println(name));;
		//Strea.of(names).forEach(name->System.out.println(name))
		
		Arrays.stream(names).forEach(name->System.out.println(name));
		
		int[] nums= {10,33,40,20,50,22,34};
		int sumoutput= Arrays.stream(nums,1,4)
				.filter(num->num%2==0)
				.sum();
		System.out.println(sumoutput);
		
		
		IntStream stream=Arrays.stream(nums, 1, 4);
			       double sumresult=  	stream.mapToObj(num->String.valueOf(num))//convert to string //"33","40","20","50"
			         	.mapToDouble(str->Double.parseDouble(str))
			         	.sum();
			         	System.out.println(sumresult);
			         	
			         	Arrays.stream(nums,1,5)
			         	         .map(num->(int)Math.pow(num, 2))
			         			.forEach(n->System.out.println(n));
			         	//create infinite stream
			         	Stream.generate(()->"Hello").limit(5).forEach(num->System.out.println(num));
	}

}
