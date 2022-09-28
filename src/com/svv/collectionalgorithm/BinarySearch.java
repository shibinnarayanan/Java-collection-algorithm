package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	
	public static void main(String[] args) {
		
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using binarySearch()
        int pos = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is " + pos);
        
        System.out.println(numbers.get(pos));
	}

}
