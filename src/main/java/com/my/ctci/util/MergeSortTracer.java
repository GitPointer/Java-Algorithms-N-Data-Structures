package com.my.ctci.util;

import java.util.Arrays;

public class MergeSortTracer {
	
	public static boolean isTraceable=true;

	public static enum step{
		Divide,
		Merge,
		AfterMerge,
		CopyAfterMerge
	}
	public static void trace(int[] arr,int[] helper, int l, int m, int r,step currentStep) {
		if(isTraceable) {
			if(currentStep==step.Divide)
				traceDivide(arr, l, m, r);
			if(currentStep==step.Merge)
				traceMerge(arr, helper,l, m,r);
			if(currentStep==step.AfterMerge)
				traceAfterMerge(arr);
			if(currentStep==step.CopyAfterMerge)
				traceCopyAfterMerge(arr, helper,l, m);
		}
	}
	private static void traceMerge(int[] arr, int[] helper, int l, int m, int r) {
		System.out
				.println("		**************************Merge{" + Arrays.toString(Arrays.copyOfRange(arr, l, m + 1))
						+ "," + Arrays.toString(Arrays.copyOfRange(arr, m + 1, r + 1)) + "}**************************");
		System.out.println("		{Orignal:" + Arrays.toString(arr) + ",helper:" + Arrays.toString(helper) + "}");
	}
	
	private static void traceDivide(int[] arr, int l, int mid,int r) {
		System.out.println("	Divide-::" + Arrays.toString(Arrays.copyOfRange(arr, l, r + 1)) + ",Mid:" + arr[mid]);
		System.out.println("		After Divide-::" + Arrays.toString(Arrays.copyOfRange(arr, l, mid + 1)) + ","
				+ Arrays.toString(Arrays.copyOfRange(arr, mid + 1, r + 1)));
	}

	private static void traceCopyAfterMerge(int[] arr, int[] helper, int helperLeft, int m) {
		int remaining = m - helperLeft;
		if (remaining >= 0) {
			int add = remaining == 0 ? 1 : remaining;
			System.out.println("		After Copying Remaining Left Side["
					+ Arrays.toString(Arrays.copyOfRange(helper, helperLeft, helperLeft + remaining + add)) + "]-::"
					+ Arrays.toString(arr));

		}
	}

	private static void traceAfterMerge(int[] arr) {
		System.out.println("		After Merge(Orignal Array)-::" + Arrays.toString(arr));
	}

}
