package com;

import java.util.HashMap;
import java.util.Map;

public class OccOfCharacters {

	public static void main(String[] args) {
		
		HashMap<Character,Integer>map= new HashMap<>();
		String str="Butter,Better";
		
		char strChar [] =str.toCharArray();
		
		for(char ch:strChar){
			if(map.containsKey(ch)) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
