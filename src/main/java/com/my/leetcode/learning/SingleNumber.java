package com.my.leetcode.learning;

/*
 * Problem: 136. Single Number
 * Difficulty: Easy
 * https: https://leetcode.com/problems/single-number/
 * 
 */
public class SingleNumber {
   public static void main(String[] args) {
      SingleNumber singleNumber = new SingleNumber();
      int[] arr = {1,1,2,2,3,4,3};
      int result = singleNumber.findSingleNumber(arr);
      System.out.println(result);
    }
   
    // XOR -> Bit Manipulation (0 ^ 0) = 0, (1 ^ 1) = 0; (1 ^ 0) = 1, (0 ^ 1) = 1;
    public int findSingleNumber(int[] arr) {
         int any = 0;
         for(int i = 0; i < arr.length; i++) {
            any ^= arr[i];
         }
         return any;
      }
      
   
}