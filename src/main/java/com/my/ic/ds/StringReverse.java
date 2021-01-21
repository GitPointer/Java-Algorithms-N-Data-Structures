package com.my.ic.ds;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

public class StringReverse {

	public static void reverse(char[] arrayOfChars) {

		// reverse input array of characters in place
		int startIndex = 0;
		int endIndex = arrayOfChars.length - 1;
		while (startIndex < endIndex) {
			char temp = arrayOfChars[startIndex];
			arrayOfChars[startIndex] = arrayOfChars[endIndex];
			arrayOfChars[endIndex] = temp;
			startIndex++;
			endIndex--;
		}

	}

	// tests

	@Test
	public void emptyStringTest() {
		final char[] actual = "".toCharArray();
		reverse(actual);
		final char[] expected = "".toCharArray();
		assertArrayEquals(expected, actual);
	}

	@Test
	public void singleCharacterStringTest() {
		final char[] actual = "A".toCharArray();
		reverse(actual);
		final char[] expected = "A".toCharArray();
		assertArrayEquals(expected, actual);
	}

	@Test
	public void longerStringTest() {
		final char[] actual = "ABCDE".toCharArray();
		reverse(actual);
		final char[] expected = "EDCBA".toCharArray();
		assertArrayEquals(expected, actual);
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(StringReverse.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests passed.");
		}
	}

}
