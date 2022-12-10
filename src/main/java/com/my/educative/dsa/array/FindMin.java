package com.my.educative.dsa.array;

public class FindMin {

	public static void main(String[] args) {
		FindMin findMin = new FindMin();
		int[] arr = { 9, 2, 3, 6 };
		System.out.println(findMin.findMinimum(arr));
	}

	public int findMinimum(int[] arr) {
		int minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minVal > arr[i]) {
				minVal = arr[i];
			}
		}
		// Write your code here
		return minVal;
	}
}
