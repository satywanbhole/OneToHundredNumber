package com.numbers;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordsInString {

	public static void main(String[] args) {
		
		String string="Hello i am satywan i pass my BE degree in 2021";
		
		String[] word=string.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0; i<word.length; i++ ) {
			
			if(map.containsKey(word[i])){
				
				map.put(word[i], map.get(word[i])+1);
			}else {
				
				map.put(word[i], 1);
			}
		}
		System.out.println(map);

	}

}
