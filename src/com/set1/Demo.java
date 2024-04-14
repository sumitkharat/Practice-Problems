package com.set1;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		String str="Sumit is Kharat from sumit is there for you";
		String lowerString[]=	str.toLowerCase().split(" ");
			
		HashMap<String, Integer> map= new HashMap<>();
		for(String s:lowerString) {
			if(map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}
}
