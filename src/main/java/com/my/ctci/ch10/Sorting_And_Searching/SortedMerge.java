package com.my.ctci.ch10.Sorting_And_Searching;

import java.util.Arrays;

/*
 * Sorted Merge: You are given 2 sorted arrays dest and src,where dest has a large enough buffer at end to hold 
 * src.Write a method to merge src into dest in sorted order.
 */
public class SortedMerge {
	
	void doMerge(int[] dest, int[] src,int destEleCount) {
		int indexDest=destEleCount-1;
		int indexSrc=src.length-1;
		int indexMerged=destEleCount+src.length-1;
		while(indexSrc>=0) {
			if(indexDest >=0 && dest[indexDest]>src[indexSrc]) {
				dest[indexMerged]=dest[indexDest];
				indexDest--;
				
			}else {
				dest[indexMerged]=src[indexSrc];
				indexSrc--;
			}
			indexMerged--;
		}
	}
	
	public static void main(String[] args) {
		int[] dest=new int[]{14,16,20,22,25,0,0,0};
		int[] src=new int[]{2,4,5};
		System.out.println("Before Merge:{dest:"+Arrays.toString(dest)+",src:"+Arrays.toString(src)+"}");
		SortedMerge sortedMerge=new SortedMerge();
		sortedMerge.doMerge(dest, src,5);
		System.out.println("After Merge:{dest:"+Arrays.toString(dest));

	}

}
