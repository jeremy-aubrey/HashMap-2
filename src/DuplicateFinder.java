import java.util.*;

/*
A function that returns the first duplicate encountered in an array of Strings.
The function adds elements to a hashmap only if they are not already present and
returns an element if it is. This ensures only one iteration through the array is necessary. 
The time complexity is O(N).

Author: Jeremy Aubrey
Date: 12/23/2021
Purpose: Practice using HashMaps for increasing efficiency
 */

public class DuplicateFinder {
	public static void main(String[] args) {
		
		String[] strArray = {"a", "b", "c", "d", "e", "c", "a"};
		String[] empArray = {};
		
		//Find first duplicate if it exists
		String duplicate1 = findFirstDuplicate(strArray);
		String duplicate2 = findFirstDuplicate(empArray);
		
		//Display results
		System.out.println("Array 1: " + Arrays.toString(strArray));
		System.out.println(duplicate1 == "" ? "No duplicates found" : "First duplicate: " + duplicate1);
		System.out.println("");
		System.out.println("Array 2: " + Arrays.toString(empArray));
		System.out.println(duplicate2 == "" ? "No duplicates found" : "First duplicate: " + duplicate2);
		
	}
	
	public static String findFirstDuplicate(String[] arr) {
		//Result to be returned
		String duplicate = "";
		
		//Only check array if a duplicate is possible 
		if (arr.length >= 2) {
			
			//HashMap to store elements of array
			HashMap<String, Boolean> hashmap = new HashMap();
			
			for (String i : arr) {
				//Verify and return element if it already exists in hashmap,
				//otherwise add it to the hashmap
				if (hashmap.containsKey(i)) {
					return duplicate = i;
				} else {
					hashmap.put(i, true);
				}
			}
		}
		
		return duplicate;
	}
}
