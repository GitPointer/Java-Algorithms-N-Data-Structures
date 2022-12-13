package com.my.educative.dsa.array;

public class ArrayProduct {
	public static void main(String[] args) {
		ArrayProduct arrayProduct = new ArrayProduct();
		// int[] arr = {1,2,3,4};
		// int[] arr = {4,2,1,5,0};
		int[] arr = { -1, 2, -3, 4, -5 };
		// arr = {0,0,0,0,40}
		int[] result = arrayProduct.arrayProduct(arr);
		for (int i : result) {
			System.out.println(i);
		}
	}
	


	public int[] arrayProduct(int[] arr) {
		// arr = {1,2,3,4}
		// arr = {24,12,8,6}

		// LOOP-1 MULTIPPLY->24
		// LOOP-> 24/1->24
		// 24/2-> 12
		// 24/3->8
		// 24/4->6

		// arr = {4,2,1,5,0}
		// arr = {0,0,0,0,40}

		// arr = {4,2,0,5,7}
		// arr = {0,0,0,0,0}
		int[] result = new int[arr.length];
		int pointer = 0;
		while (pointer != arr.length) {
			int mul = 1;
			for (int i = 0; i < arr.length; i++) {
				if (i != pointer) {
					mul = mul * arr[i];
				}
			}
			result[pointer++] = mul;

		}

		// Map<Integer, Integer> counterAndIndex = new HashMap<Integer, Integer>();
		// int index = 0;
		// for (int index = 0; index < arr.length; index++) {
		// if (arr[index] == 0) {

		// }
		// }
		// if (zeroCount >= 2) {
		// return new int[arr.length];
		// }
		// for (int index = 0; index < arr.length; index++) {
		// if ()
		// }
		return result;

	}
}