package com.lumen.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> hashmap=new HashMap<Integer, String>();

		hashmap.put(1,"Java");
		hashmap.put(10,"Spring");
		hashmap.put(8,"Node");
		hashmap.put(null,"Css");
		hashmap.put(3,"Angular");
		hashmap.put(5,"Html");
		hashmap.put(1,"react");
		hashmap.put(100,null);
		hashmap.put(101,null);
		System.out.println(hashmap);
		
		System.out.println(hashmap.get(1));
		System.out.println(hashmap.get(20));
		System.out.println(hashmap.getOrDefault(20,"Node"));
		System.out.println(hashmap.containsKey(1));
		
		
		Set<Integer> keys=hashmap.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+hashmap.get(key));
			
		}
		System.out.println();
		
		//get inner class entry
		Set<Entry<Integer,String>> map= hashmap.entrySet();
		for(Entry<Integer,String>entry:map) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println();
		
		for(Map.Entry<Integer, String> entry: hashmap.entrySet()) {
			Integer key=entry.getKey();
			String val=entry.getValue();
			System.out.println(key+" "+val);
		}
		
		
		
	}

}
