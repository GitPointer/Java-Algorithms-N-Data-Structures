package com.my.educative.dsa;

public class FindSecondMaximum {
    

    public static void main(String[] args) {
        FindSecondMaximum findSecondMaximum =  new FindSecondMaximum() ;
        int[] arr = {4,2,1,5,0};
        int result = findSecondMaximum.findSecondMaximum(arr);
        int anotherResult = findSecondMaximum.findSecondMaxInOnePass(arr);
        System.out.println(result);
        System.out.println(anotherResult);


    }


    public int findSecondMaximum(int[] arr) {
       int firstMaximum = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for (int index = 0; index < arr.length; index++) {
           if (arr[index] > firstMaximum)  {
               firstMaximum = arr[index];
           }
       }
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > secondMax && arr[i] != firstMaximum)  {
               secondMax = arr[i];
           }
       }
       return secondMax;
    }  



    public int findSecondMaxInOnePass(int[] arr) {
         int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
         //int[] arr = {4,2,1,5,0};
         //1-> 4>firstMax.MIN.  =>TRUE                             =>secondMax =firstMax.MIN, firstMax=4
         //2-> 2>4              =>FALSE=>(2>firstMax.MIN && 2! 4)  =>secondMax= 2
         for (int index = 0; index < arr.length; index++) {
             if (arr[index] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[index];
             } else if (arr[index] > secondMax && arr[index] != firstMax) {
                secondMax = arr[index] ;
             }
         }
       return secondMax;

    }
}
