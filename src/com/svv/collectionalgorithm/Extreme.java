package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Extreme {
	
	//The min() and max() methods of the Java collections framework are used to find the minimum and the maximum elements, respectively

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(3);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
	}
	
}
