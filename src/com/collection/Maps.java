package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(45, "Amar");
		map.put(46, "Pravin");
		Set<Integer> ks = map.keySet();
		for (Integer i : ks) {

			System.out.println(i + " " + map.get(i));

		}

	}
}
