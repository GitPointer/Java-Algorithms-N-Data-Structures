package com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo;

import java.util.Arrays;

import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.Interface.SortingInterface;

/*
 * Time Complexity:O(n2)
 */
public class SelectionSort implements SortingInterface {

	@Override
	public void doSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			System.out.println("	Pass-" + (i + 1) + "::" + Arrays.toString(arr) + ",Min:" + arr[min]);
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				System.out.println("		Iteration-" + (j - i) + "::"
						+ Arrays.toString(Arrays.copyOfRange(arr, j, arr.length)) + ",Min:" + arr[min]);
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// int[] arr=new int[]{2,3,4,5,6};
		int[] arr = new int[] { 16, 14, 5, 6, 8 };
		SortingInterface sorting = new SelectionSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

}
