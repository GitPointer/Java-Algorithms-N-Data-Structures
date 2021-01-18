package com.my.ctci.ch02.Sorting_And_Searching;

import java.util.Arrays;

public class SortingExecutor {

	public static void main(String[] args) {
		SortingInterface sorting = null;
		int[] data=new int[] { 16, 14, 5, 6, 8 };;
		int[] arr=null;
		
		System.out.println("[******BubbleSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting=new BubbleSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
		
		
		System.out.println("[******SelectionSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting=new SelectionSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
		
		
		System.out.println("[******SelectionSort******]");
		arr = Arrays.copyOf(data, data.length);
		sorting=new InsertionSort();
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

}
