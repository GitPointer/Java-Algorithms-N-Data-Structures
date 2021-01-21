package com.my.ctci.ch01.Arrays_And_Strings;

import java.util.Arrays;

/*
 * Given 2 Strings,write a method to decide if one is a permutation of the other.
 */

public class CheckPermutation {

	/*
	 * Approach A 1) Sort both strings 2) Compare the sorted strings
	 * 
	 * Time Complexity: Time complexity of this method depends upon the sorting
	 * technique used. In the above implementation, quickSort is used which may be
	 * O(n^2) in worst case. If we use a O(nLogn) sorting algorithm like merge sort,
	 * then the complexity becomes O(nLogn)
	 */
	public class ApporachA {
		private String sort(String s) {
			char[] content = s.toCharArray();
			Arrays.sort(content);
			return new String(content);
		}

		boolean permutation(String s1, String s2) {
			if (s1.length() != s2.length()) {
				return false;
			}
			return sort(s1).equals(sort(s2));

		}
	}
	/*
	 * Approach B Check if 2 strings have identical character counts. This utilize
	 * the definition of a permutation-2 words with the same characters counts To
	 * implement this we assumed that the characters is ASCII and only 128 possible
	 * characters are there.
	 * 
	 * Time Complexity: O(n)
	 */

	public class ApporachB {

		boolean permutation(String s1, String s2) {
			if (s1.length() != s2.length()) {
				return false;
			}
			int[] letters = new int[128];// assume
			for (int i = 0; i < s1.length(); i++) {
				letters[s1.charAt(i)]++;

			}
			for (int i = 0; i < s2.length(); i++) {
				letters[s2.charAt(i)]--;
				if (letters[s2.charAt(i)] < 0) {
					return false;
				}

			}
			return true;

		}

	}

	public static void main(String[] args) {
		String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
		CheckPermutation.ApporachA solA = new CheckPermutation().new ApporachA();
		CheckPermutation.ApporachB solB = new CheckPermutation().new ApporachB();
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagramA = solA.permutation(word1, word2);
			System.out.println("[ApporachA]" + word1 + ", " + word2 + ": " + anagramA);
			boolean anagramB = solB.permutation(word1, word2);
			System.out.println("[ApporachB]" + word1 + ", " + word2 + ": " + anagramB);
		}

	}

}
