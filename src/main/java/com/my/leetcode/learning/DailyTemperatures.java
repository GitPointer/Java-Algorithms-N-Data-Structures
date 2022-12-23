package com.my.leetcode.learning;

import java.util.Stack;

import com.my.leetcode.learning.util.DSAUtil;

/*
 * Problem: 739. Daily Temperatures
 * Difficulty: Medium
 * https://leetcode.com/problems/daily-temperatures/description/
 * 
 */
public class DailyTemperatures {
    
    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] nums = new int[]{73,74,75,71,69,72,76,73};
        //[1,1,4,2,1,1,0,0]
        int[] result=dailyTemperatures.findWarmerDay(nums);
        System.out.println("Input Array is::"+DSAUtil.getArrayData(nums));
        System.out.println("Result Array is::"+DSAUtil.getArrayData(result));

    }

    private int[] findWarmerDay(int[] nums) {
        int len=nums.length;
        int[] result=new int[nums.length];
        Stack<Integer> stack= new Stack<>();
        for(int i=len-1;i>=0;i--){
           while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
            stack.pop();
           }
           if (!stack.isEmpty()) {
              result[i] = stack.peek() - i;
           }
           stack.push(i);
        }
        return result;
    }
}
