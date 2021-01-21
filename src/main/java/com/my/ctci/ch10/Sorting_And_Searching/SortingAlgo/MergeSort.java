package com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo;

import java.util.Arrays;

import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.Interface.SortingInterface;
import com.my.ctci.util.MergeSortTracer;

public class MergeSort implements SortingInterface {

	@Override
	public void doSort(int[] arr) {
		int[] helper = new int[arr.length];
		mergeSort(arr, helper, 0, arr.length - 1);

	}

	void mergeSort(int[] arr, int[] helper, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			MergeSortTracer.trace(arr, helper, l, mid, r, MergeSortTracer.step.Divide);
			mergeSort(arr, helper, l, mid);
			mergeSort(arr, helper, mid + 1, r);
			merge(arr, helper, l, mid, r);
		}
	}

	void merge(int[] arr, int[] helper, int l, int mid, int r) {
		// Copy both halves into the helper array
		for (int i = l; i <= r; i++) {
			helper[i] = arr[i];
		}
		MergeSortTracer.trace(arr, helper, l, mid, r, MergeSortTracer.step.Merge);

		int helperLeft = l;
		int helperRight = mid + 1;
		int current = l;

		/*
		 * Iterate through helper array. Compare the left and right half, copying back
		 * the smaller element from the two halves into the original array.
		 */
		while (helperLeft <= mid && helperRight <= r) {
			if (helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft++;
			} else { // If right element is smaller than left element
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		MergeSortTracer.trace(arr, helper, l, mid, r, MergeSortTracer.step.AfterMerge);

		/*
		 * Copy the rest of the left side of the array into the target array
		 */
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			arr[current + i] = helper[helperLeft + i];
		}
		MergeSortTracer.trace(arr, helper, helperLeft, mid, r, MergeSortTracer.step.CopyAfterMerge);

	}

	public static void main(String[] args) {
		// int[] arr=new int[]{2,3,4,5,6};
		int[] arr = new int[] { 14, 2, 0, 2, 11, 12, 10, 4, 0, 3, 11, 2, 10, 9, 5, 8, 14, 19, 2, 1 };
		SortingInterface sorting = new MergeSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}
}
