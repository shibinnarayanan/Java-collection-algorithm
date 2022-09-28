package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(9);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		
		System.out.println("Unsorted arraylist -> "+arr);
		
		Collections.sort(arr);
		
		System.out.println("Sorted arraylist -> "+arr);
	}

}
