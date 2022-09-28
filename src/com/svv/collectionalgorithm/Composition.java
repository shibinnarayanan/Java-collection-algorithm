package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Composition {
	
//	frequency() - returns the count of the number of times an element is present in the collection
//	disjoint() - checks if two collections contain some common element.Returns true if the two specified collections have noelements in common
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);
        
        int count = Collections.frequency(numbers,2);
        
        System.out.println("frequence() -> Count of 2: " + count);
        
        
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);
        
        boolean value = Collections.disjoint(numbers, newNumbers);
        
        System.out.println("disjoint() -> Two lists are disjoint: " + value);
	}

}
