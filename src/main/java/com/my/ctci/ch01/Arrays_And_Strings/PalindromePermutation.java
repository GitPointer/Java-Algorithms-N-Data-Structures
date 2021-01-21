package com.my.ctci.ch01.Arrays_And_Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
*	Given a string, determine if a permutation of the string could form a palindrome.
*	For example,
*		"code" -> False, "aab" -> True, "carerac" -> True.
*/
/*
 * If a string with a even length is a palindrome,every character in the string must always 
 * occur an even number of times.
 * If the string with a odd length is a palindorme,every character except one of the character
 * must always occur an even number of times.
 * Thus in case of palindrome, the number of characters in odd number of occurrence must not exceed with 1.
 * 
 */
public class PalindromePermutation {

	/**
	 * Approach 1 – HashMap With the above discussion,We need to count the odd
	 * number of occurrence in the string. We will utilize a Hashmap to store the
	 * character and its occurrence. Steps of execution are as below:
	 * 
	 * 1. Traverse over the String.
	 *
	 * 2. For every new character in the String, we will create the new entry in the
	 * map and add the count as 1.
	 * 
	 * 3. If the same character occurred again we will increment the count.
	 * 
	 * 4. At the end we will traverse the map and find the characters having the odd
	 * counts.
	 * 
	 * 5. Based of this count we will decide if String is a palindrome permutation
	 * or not.
	 * 
	 * Complexity Analysis:
	 * 
	 * Time Complexity:O(n)
	 * 
	 * Space Complexity:O(n)
	 * 
	 **/
	public boolean canPermutePalindromeA1(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		int count = 0;
		for (char key : map.keySet()) {
			count += map.get(key) % 2;
		}
		return count <= 1;
	}

	/**
	 * Approach 2: HashSet
	 * 
	 * Algorithm:A modification of the last approach could be by making use of a set
	 * for keeping track of the number of elements with odd number of occurrences in
	 * s. For doing this, we traverse over the characters of the string s. Whenever
	 * the number of occurrences of a character becomes odd, we put its entry in the
	 * set. Later on, if we find the same element again, lead to its number of
	 * occurrences as even, we remove its entry from the set. Thus, if the element
	 * occurs again(indicating an odd number of occurrences), its entry won't exist
	 * in the set.
	 * 
	 * Based on this idea, when we find a character in the string s that isn't
	 * present in the set (indicating an odd number of occurrences currently for
	 * this character), we put its corresponding entry in the set. If we find a
	 * character that is already present in the set (indicating an even number of
	 * occurrences currently for this character), we remove its corresponding entry
	 * from the set.
	 * 
	 * At the end, the size of set indicates the number of elements with odd number
	 * of occurrences in s. If it is lesser than 2, a palindromic permutation of the
	 * string s is possible, otherwise not.
	 * 
	 * Complexity Analysis Time complexity : O(n). We traverse over the string s of
	 * length n once only. Space complexity : O(n). The set can grow upto a maximum
	 * size of n in case of all distinct elements.
	 */
	public boolean canPermutePalindromeA2(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.add(str.charAt(i))) {
				set.remove(str.charAt(i));
			}
		}
		return set.size() <= 1;
	}

	// https://github.com/cherryljr/LeetCode/blob/master/Palindrome%20Permutation.java

}
