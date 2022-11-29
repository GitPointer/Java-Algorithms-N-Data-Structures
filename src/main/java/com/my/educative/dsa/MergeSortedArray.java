package com.my.educative.dsa;

public class MergeSortedArray {
    public static void main(String[] args) {
      MergeSortedArray msr = new MergeSortedArray();
      int[] inputArr1 = {1,2,7,8,9,11};
      int [] inputArr2= {3,5,6,10,12};

      //int[] inputArr2 = {1,2,7,8,9,11};
      //int [] inputArr1= {3,5,6,10,12};
      int []result = msr.mergeArrays(inputArr1, inputArr2);
      for(int i:result) {
        System.out.println(i);
      }
    }
    public int[] mergeArrays(int[]  arr1, int[] arr2)  {
        int index1 = 0;
        int index2 = 0;
        int []result = new int[arr1.length + arr2.length];
        int resultIndex = 0;
        while (index1<arr1.length && index2<arr2.length) {
          if (arr1[index1] < arr2[index2]) {
             result[resultIndex] = arr1[index1];
             index1++;
          } else {
            result[resultIndex] = arr2[index2];
            index2++;
          }
          resultIndex++;
          //System.out.println(index1);
         // System.out.println(index2);
          //System.out.println(resultIndex);
        }
        while (index1 < arr1.length) {
            result[resultIndex] = arr1[index1];
            resultIndex++;
            index1++;
         }
        while (index2 < arr2.length) {
            result[resultIndex] = arr2[index2];
            resultIndex++;
            index2++;
         }
       
       return result;
    }
}
