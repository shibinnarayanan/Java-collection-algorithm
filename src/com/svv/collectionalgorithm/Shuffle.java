package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println("sorted arraylist -> "+arr);
		
		Collections.shuffle(arr);
		
		System.out.println("Shuffled arraylist -> "+arr);
	}

}
