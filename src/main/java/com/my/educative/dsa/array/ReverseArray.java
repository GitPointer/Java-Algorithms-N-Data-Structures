package com.my.educative.dsa.array;


public class ReverseArray {
    public static void main(String[] args) {
         ReverseArray reverseArray = new ReverseArray();
         int[] result = new int[]{10, 9, 4, 6, 5};
         reverseArray.reverseTheArrayLogN(result);
         for (int value : result) {
            System.out.println(value);
            System.out.println(",");
         }

    } 



    public void reverseTheArray(int[] arr) {
         //10, 9, 4, 6
         //10,9,4,5,6

//temp=4
         //10,9,9,6

         //4,10,9,4,6

         int pointer = 1;
         
         while (pointer != arr.length ) {
              int temp = arr[pointer];          
              int index = pointer; //1
              while(index != 0) {
                  arr[index] = arr[index - 1]; // 
                  index -= 1;
              }
              arr[0] = temp;
              pointer += 1;
         } 
    } 



     public void reverseTheArrayLogN(int[] arr) {
      
         int firstPointer = 0;
         int lastPointer = arr.length-1;
     
         while (firstPointer < lastPointer) {
              int temp = arr[lastPointer];
              arr[lastPointer] = arr[firstPointer];
              arr[firstPointer] = temp;
              firstPointer += 1;
              lastPointer -= 1;
         } 
    } 
}