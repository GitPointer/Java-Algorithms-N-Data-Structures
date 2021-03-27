package com.my.leetcode;

public class IPAddressValidator {

	boolean isIpAddressValid(String str) {
		if (str != null && ("".equals(str) || str.endsWith("\\."))) {
			return false;
		}
		String[] strArray = str.split("\\.");
		System.out.print(strArray.length);
		if (strArray.length != 4) {
			return false;
		}
		for (String part : strArray) {

			char[] partArray = part.toCharArray();
			if (partArray.length > 1 && '0' == partArray[0]) {
				return false;
			}
			try {
				int val = Integer.parseInt(part);
				if (val < 0 || val > 255) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String input = "a.b.c.d";
		// 1.2.3.4
		// input ="0.18.25.66";
		// input ="0.18.255.255";
		// input ="0.18.255.255";
		// input ="0123.0.0.0"
		input = "1.0.0.0..";
		IPAddressValidator test = new IPAddressValidator();
		System.out.print(test.isIpAddressValid(input));

	}

}
