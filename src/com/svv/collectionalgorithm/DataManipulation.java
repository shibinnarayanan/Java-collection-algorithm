package com.svv.collectionalgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DataManipulation {
	
//	reverse() - reverses the order of elements
//	fill() - replace every element in a collection with the specified value
//	copy() - creates a copy of elements from the specified source to destination
//	swap() - swaps the position of two elements in a collection
//	addAll() - adds all the elements of a collection to other collection

	
	public static void main(String[] args) {
		
		// Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(3);

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
        
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        a.add(1);
        a.add(2);
        b.add(3);
    
        Collections.copy(a,b);
        
        System.out.println("Copy test --- " + a);

	}

}
