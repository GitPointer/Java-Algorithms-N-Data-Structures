package com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo;

import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.Interface.SortingInterface;

public class QuickSort implements SortingInterface {

	@Override
	public void doSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);

	}

	void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);

		if (left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
	}

	int partition(int[] arr, int left, int right) {
		// int pivot=arr[(left+right)/2];
		int pivot = arr[left];
		while (left <= right) {
			// Find element on the left that should be on the right
			while (arr[left] < pivot)
				left++;
			// FInd element on the right that should be on the left
			while (arr[right] > pivot)
				right--;
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		return left;
	}

}
