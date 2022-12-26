package com.numbers;

import java.util.HashMap;
import java.util.Map;

public class ArrayOccurance {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,50,60,10,50,30,40,30};
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>(); // create the loosely coupled map object
		
		for(int i=0; i<a.length; i++) {  // use for loop for interation
			
			if(map.containsKey(a[i])) {
				
				map.put(a[i], map.get(a[i])+1);
				
				
			}else {
				
				map.put(a[i], 1);
			}
		}System.out.println(map+"\t");
		
		map.forEach((k,v)->System.out.println("Key : "+k+" value : "+v));

	}

}
