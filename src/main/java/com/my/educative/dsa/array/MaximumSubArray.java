package com.my.educative.dsa.array;

public class MaximumSubArray {
    public static void main(String[] args) {
      MaximumSubArray maximumSubArray = new MaximumSubArray();
      int[] arr = {1, 7, -2, -5, 10, -1};
      int result = maximumSubArray.maximumSubArrayKadanesApproach(arr);
      System.out.println(result);
    }


    public int maximumSubArraySum(int[] arr) {
      //Pass-1
      /*
      *. Pass-1
       * 7=7
       * 7-2-5=6
       * 7-2-5+10=4
       * 7-2-5+10+1=-1
       * -1+7-2-5+10=9
       *  -1+7-2-5+10-1=8
       */
        int maxSum = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
          int sum =0;
           for (int j = index; j < arr.length; j++) {
            sum =sum+arr[j];
            if(maxSum<sum){
               maxSum=sum;
             }
           }
          // System.out.println(maxSum);
          }
        
        return maxSum;
    }


    public int maximumSubArrayKadanesApproach(int[] arr) {
      int maxSum = arr[0];
      int sum = 0;
      for (int index = 0; index < arr.length; index++) {
          sum += arr[index];
          if (sum > maxSum) {
              maxSum = sum;
          }
          if (sum < 0) {
              sum = 0;
          }
      }
      return maxSum;
    }
}



/*

Pass 1
 {1, 7, -2, -5, 10, -1};
sum = 0
maxSum = 1

0thIndex = 1, sum = 1 , maxSum = 1
1st Index = -2, sum = -1, maxSum = 1, Sum = 0
2nd Index = -5, sum = -5, maxSum = 1, sum = 0
3rd Index = 10, sum = 10, maxSum = 10
4th Index = -1, sum  = 9, maxSum = 10

return maxSum = 10;


*/



