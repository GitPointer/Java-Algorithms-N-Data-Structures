package com.my.ctci.ch10.Sorting_And_Searching;

import java.util.Arrays;



/*
 * Time Complexity:O(n2)
 */
public class BubbleSort implements SortingInterface {
	
	@Override
	public void doSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean noSwapping=true;
			System.out.println("	Pass-"+(i+1)+"::"+Arrays.toString(arr));
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					noSwapping=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println("		Iteration-"+(j+1)+"::"+Arrays.toString(arr));
			}
			if(noSwapping) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//int[] arr=new int[]{2,3,4,5,6};
		int[] arr=new int[]{16,14,5,6,8};
		SortingInterface sorting=new BubbleSort();
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		sorting.doSort(arr);
		System.out.println("After Sorting:"+Arrays.toString(arr));
	}

}
