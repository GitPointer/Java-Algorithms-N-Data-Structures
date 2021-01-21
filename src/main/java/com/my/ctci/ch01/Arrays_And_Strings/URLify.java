package com.my.ctci.ch01.Arrays_And_Strings;

import com.my.ctci.util.Util;

/*
 * URLify a given string (Replace spaces is %20)
 * Write a method to replace all the spaces in a string with ‘%20’. 
 * You may assume that the string has sufficient space at the end to 
 * hold the additional characters and that you are given the “true” length of the string.
 * 
 * Time Complexity: O(n), where n is the true length of the string. 
 * Auxiliary Space: O(1), because the above program is an in-place algorithm.
 */

public class URLify {

	public void doURLify(char[] str, int trueLength) {
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		int index = trueLength + spaceCount * 2;
		if (trueLength < str.length)
			str[trueLength] = '\0';
		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}

	public int findTrueLength(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		URLify uRLify = new URLify();
		String str = "Mr. John Bradman    ";
		char[] arr = str.toCharArray();
		int trueLength = uRLify.findTrueLength(arr) + 1;
		uRLify.doURLify(arr, trueLength);
		System.out.println("\"" + Util.charArrayToString(arr) + "\"");

	}

}
