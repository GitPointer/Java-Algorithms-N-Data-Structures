package com.my.ctci.ch01.Arrays_And_Strings.Q1_Is_Unique;

import java.util.Arrays;

/*
 * Determine if a string has all Unique Characters
 */
public class IsUnique {
	
	/*
	 * Approach 1 – Brute Force technique: 
	 * Run 2 loops with variable i and j. Compare str[i] and str[j]. 
	 * If they become equal at any point, return false. 
	 * Time Complexity: O(n2) 
	 * 
	 */
	 public static boolean isUniqueCharsA1(String str) {
		 
		 for(int i=0;i<str.length();i++) {
			 for(int j=i+1;j<str.length();j++){
				 if(str.charAt(i)==str.charAt(j)) {
					 return false;
				 }		 
			 }
		 }
		 
		 return true;
	 }
	 
	 /*
	  * Approach 2 – Sorting: Using sorting based on ASCII values of characters 
	  * Time Complexity: O(n log n) 
	  */
	 
	 public static boolean isUniqueCharsA2(String str) {
		 char[] charArray=str.toCharArray();
		 Arrays.sort(charArray);
		 for(int i=0;i<charArray.length-1;i++) {
			 if(charArray[i]==charArray[i+1]) {
				 return false;
			 }else {
				 continue;
			 }
		 }
		 return true;
	 }
	
	/*
	 * Approach 3 – Use of Extra Data Structure: 
	 * This approach assumes ASCII char set(8 bits). 
	 * The idea is to maintain a boolean array for the characters. 
	 * The 256 indices represent 256 characters. 
	 * All the array elements are initially set to false. As we iterate over the string, 
	 * set true at the index equal to the int value of the character. 
	 * If at any time, we encounter that the array value is already true, 
	 * it means the character with that int value is repeated. 
	 * Time Complexity: O(n) 
	 */
	public static boolean isUniqueCharsA3(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	/*
	 * Approach 4 – Without Extra Data Structure: 
	 * Time Complexity: O(n)  
	 */
	
	/* Assumes only letters a through z. */
	public static boolean isUniqueCharsA4(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			//System.out.println("isUniqueCharsA1::"+word + ": " + isUniqueCharsA1(word));
			//System.out.println("isUniqueCharsA2::"+word + ": " + isUniqueCharsA2(word));
			//System.out.println("isUniqueCharsA3::"+word + ": " + isUniqueCharsA3(word));
			System.out.println("isUniqueCharsA4::"+word + ": " + isUniqueCharsA4(word));
		}
	}

}
