package com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.Executor;

import java.util.Arrays;

import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.BubbleSort;
import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.InsertionSort;
import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.MergeSort;
import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.QuickSort;
import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.SelectionSort;
import com.my.ctci.ch10.Sorting_And_Searching.SortingAlgo.Interface.SortingInterface;

public class SortingExecutor {

	public static void main(String[] args) {
		SortingInterface sorting = null;
		int[] data = new int[] { 16, 14, 5, 6, 8 };
		;
		int[] arr = null;

		System.out.println("[******BubbleSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting = new BubbleSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));

		System.out.println("[******SelectionSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting = new SelectionSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));

		System.out.println("[******InsertionSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting = new InsertionSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));

		System.out.println("[******QuickSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting = new QuickSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));

		System.out.println("[******MergeSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting = new MergeSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		// MergeSortTracer.isTraceable=false;
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

}
