package com.my.educative.dsa.array;

public class ReArrange {

	public static void main(String[] args) {
		ReArrange reArrange = new ReArrange();
		int[] arr = { 10, -1, 20, 4, 0, 5, -9, -6 };
		reArrange.reArrange(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private void reArrange(int[] arr) {
		int leftPointer = 0;
		int rightPointer = arr.length - 1;

		while (leftPointer != rightPointer) {
			if (arr[leftPointer] > 0 && arr[rightPointer] < 0) {
				int temp = arr[leftPointer];
				arr[leftPointer] = arr[rightPointer];
				arr[rightPointer] = temp;
				leftPointer++;
				rightPointer--;
			} else if (arr[leftPointer] > 0 && arr[rightPointer] > 0) {
				rightPointer--;
			} else {
				leftPointer++;
			}
		}

	}
	/*
	 * 
	 * leftPointer = 0 rightPointer = 6 {10, -1, 20, -4, 5, -9, -6}; //left>0
	 * rigt<h>>0
	 * 
	 * 0 !6 { arr[0](10) > 0 && arr[6](-6) < 0 { temp = arr[0](10); arr[0](10) =
	 * arr[6](-6) arr[6](-6) = 10; 0 -> 1 // Increment left Pointer 6 -> 5.//
	 * Decrementt left Pointer } arr[0](10) > 0 && arr[6](-6) > 0 { 6 -> 5; //
	 * Decrement right pointer } arr[0] < 0 && arr[6] < 0 { 0 -> 1 // Increment left
	 * pointer } }
	 */
}
