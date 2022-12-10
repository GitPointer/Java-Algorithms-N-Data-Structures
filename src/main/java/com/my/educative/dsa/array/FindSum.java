package com.my.educative.dsa.array;

public class FindSum {

	public static void main(String[] args) {
		int[] arr = { 1, 21, 3, 14, 5, 60, 7, 6 };
		int value = 27;

		FindSum findSum = new FindSum();
		int[] result = findSum.findSum(arr, value);
		for (int i : result) {
			System.out.println(i);
		}
		// int[] arr = {1, 3, 5, 6, 7, 14,21,60};

	}

	public int[] findSum(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int findValue = n - arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == findValue) {
					return new int[] { arr[i], arr[j] };
				}
			}
		}
		return arr;
	}
}
