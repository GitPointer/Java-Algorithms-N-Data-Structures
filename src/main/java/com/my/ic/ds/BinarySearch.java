package com.my.ic.ds;


public class BinarySearch {
	
	public static boolean binarySearch(int srchEle, int arry[]) {
		
		int startIndex=-1;
		int endIndex=arry.length;
		while(startIndex+1<endIndex) {
			int len=endIndex-startIndex;
			int mid = len/2;
			int midIndex = startIndex+mid;
			int midEle = arry[midIndex];
			if(midEle == srchEle) {
				return true;
			}
			if(midEle > srchEle) {
				endIndex = midIndex;
			}else {
				startIndex=midIndex;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arry[] = {1,2,3,4,5,6,7,8,9,10};
		int srchEle = 1;
		System.out.println(binarySearch(srchEle,arry));
	}

}
