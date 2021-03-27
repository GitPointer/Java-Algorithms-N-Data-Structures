package com.my.ctci.ch01.Arrays_And_Strings;

import java.util.Arrays;

public class RotateMatrix {
	
	/*
	 * Approach A 1) Transpose the matrix 2) Swap the column first to last
	 * 
	 * Time Complexity: O(n^2)
	 */
	public class ApporachA {
		
		void doRotation(int[][] matrix){
			doTranspose(matrix);
			doColumnSwap(matrix);
		}
		private void doTranspose(int[][] mat) {
			// Transpose the matrix
	        for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < i; j++) {
	                int temp = mat[i][j];
	                mat[i][j] = mat[j][i];
	                mat[j][i] = temp;
	            }
	        }
			
		}
		private void doColumnSwap(int[][] mat) {
			int N=mat.length;
			// swap columns
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N / 2; j++) {
	                int temp = mat[i][j];
	                mat[i][j] = mat[i][N - j - 1];
	                mat[i][N - j - 1] = temp;
	            }
	        }
		}
		
		
	}
	
	/*
	 * Approach B 1) Perform the Circular rotation on each layer,top==>right,right==>bottom,bottom==>left,left==>top
	 * 
	 * 
	 * Time Complexity: O(n^2)
	 */
	public class ApporachB {
		void doRotation(int[][] mat){
			int N=mat.length;
			// Traverse each cycle
		    for (int i = 0; i < N / 2; i++)
		    {
		        for (int j = i; j < N - i - 1; j++)
		        {
		 
		            // Swap elements of each cycle
		            // in clockwise direction
		            int temp = mat[i][j];
		            mat[i][j] = mat[N - 1 - j][i];
		            mat[N - 1 - j][i] = mat[N - 1 - i][N - 1 - j];
		            mat[N - 1 - i][N - 1 - j] = mat[j][N - 1 - i];
		            mat[j][N - 1 - i] = temp;
		        }
		    }
		}
		
		
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			{ 1,5,8},
            { 2,4,0 },
            { 9,9,3 }
		};
		RotateMatrix.ApporachA solA = new RotateMatrix().new ApporachA();
		System.out.println("Apporach A:Before Rotation:");
		for (int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }
		solA.doRotation(matrix);
		System.out.println("Apporach A:After Rotation:");
		for (int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }
		RotateMatrix.ApporachB solB = new RotateMatrix().new ApporachB();
		System.out.println("Apporach B:Before Rotation:");
		for (int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }
		solB.doRotation(matrix);
		System.out.println("Apporach B:After Rotation:");
		for (int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }
	}

}
