package com.my.leetcode.learning.util;

public class DSAUtil {

    public static String getArrayData(int[] nums){
       StringBuilder result= new StringBuilder();
       result.append("[");
       for(int i=0;i<nums.length;i++){
           result.append(nums[i]);
           if(i<nums.length-1){
            result.append(",");
           }
       }
       result.append("]");
       return result.toString();
    }
    
}
