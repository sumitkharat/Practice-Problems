package com;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAscandDesc {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
	list.add("Sumit");
	list.add("Vilas");
	list.add("Rani");
	list.add("Karan");
	list.add("Vandana");
	list.add("Atharva");
		
	
	System.out.println("Before Sorting");
	
	System.out.println(list);
	System.out.println();
	
	System.out.println("After sorting ascending");
	Collections.sort(list);
	System.out.println(list);	
	System.out.println();
	
	System.out.println("After sorting descending");
	Collections.reverse(list);
	System.out.println(list);
	System.out.println();
	
	}
}
