package com.my.educative.dsa.array;

public class RotateArray {

    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        //(1,2,3,4,5)->5
        //(5,1,2,3,4,)
        

       new RotateArray().rotateArray(arr);
       for(int i:arr){
        System.out.println(i);
       }
    }

    
    void rotateArray(int[] arr){
        int lastEle = arr[arr.length-1];
        for (int index = arr.length-1; index > 0 ; index--) {
             arr[index] = arr[index-1];
        }
        arr[0] = lastEle;

    }

}
