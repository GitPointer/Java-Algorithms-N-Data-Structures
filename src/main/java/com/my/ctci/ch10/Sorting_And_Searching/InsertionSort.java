package com.my.ctci.ch10.Sorting_And_Searching;

import java.util.Arrays;
/*
 * Time Complexity:O(n2)
 */
public class InsertionSort implements SortingInterface {

	@Override
	public void doSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			System.out.println("	Pass-"+(i)+"::"+Arrays.toString(arr)+",Key:"+key);
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				System.out.println("		Iteration::"+Arrays.toString(arr));

			}
			arr[j+1]=key;
			System.out.println("		After Iteration::"+Arrays.toString(arr));


		}
	}
	public static void main(String[] args) {
		//int[] arr=new int[]{2,3,4,5,6};
		int[] arr=new int[]{16,14,5,6,8};
		SortingInterface sorting=new InsertionSort();
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:"+Arrays.toString(arr));
	}

}
