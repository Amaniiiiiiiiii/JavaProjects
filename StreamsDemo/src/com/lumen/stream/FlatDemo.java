package com.lumen.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatDemo {

	public static void main(String[] args) {
    String[] names=  {"Amani","Nazir","Ahmed","Banu","Omar"};
    Arrays.stream(names).forEach(System.out::println);
    //2d array
    String [][] courses= {{"Java","python","C"},{"Fleming","Anacon","Programming"}};
    Stream<String[]> streamTwo=Arrays.stream(courses);
    //call flatmap to convert each line of array into one chunk like multiple single arrays
    Stream<String> streamo=streamTwo.flatMap(oneArr->Arrays.stream(oneArr));
    
    //apply map to break down those chunks to individual elemtns
    streamo.mapToInt(String::length).forEach(System.out::println);
    
    Arrays.stream(courses)
    .flatMap(oneArr->Arrays.stream(oneArr))
    .map(String::toUpperCase)
    .forEach(System.out::println);
    
	}

}
