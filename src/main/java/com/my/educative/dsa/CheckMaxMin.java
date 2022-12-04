package com.my.educative.dsa;

public class CheckMaxMin {
    public static void main(String[] args){
        CheckMaxMin checkMaxMin = new CheckMaxMin();
        int[] arr = {1, 2, 3, 4, 5,6};
        //checkMaxMin.maxMin(arr);
        checkMaxMin.maxMinConstSpace(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    public  void maxMin(int[] arr) {
        int[] result = new int[arr.length];
        int pointerSmall =0; 
        int pointerLarge = arr.length - 1;
        boolean switchPointer = true;
        for (int i = 0; i < arr.length; i++) {
            if (switchPointer)
              result[i] = arr[pointerLarge--]; // copy large values
            else 
              result[i] = arr[pointerSmall++]; // copy small values
      
            switchPointer = !switchPointer;   // switching between samll and large
          }

          for (int j = 0; j < arr.length; j++) {
            arr[j] = result[j];    // copying to original array
          }
        }

        public  void maxMinConstSpace(int[] arr) {
            int maxIdx = arr.length - 1;
            int minIdx = 0;
            int maxElem = arr[maxIdx] + 1; // store any element that is greater than the maximum element in the array 
            for( int i = 0; i < arr.length; i++) {
              // at even indices we will store maximum elements
              if (i % 2 == 0){  
                arr[i] += (arr[maxIdx] % maxElem ) * maxElem;
                maxIdx -= 1;
              }
              else { // at odd indices we will store minimum elements
                arr[i] += (arr[minIdx] % maxElem ) * maxElem;
                minIdx += 1;
              }
            }
        
            
            // dividing with maxElem to get original values.
            for( int i = 0; i < arr.length; i++) {
              arr[i] = arr[i] / maxElem;
            }
          }

/*
1 9 9 9 9
2 1 1 1 1
3 2 8 8 8
4 3 2 2 2
5 4 3 7 7
6 5 4 3 3
7 6 5 4 6
8 7 6 5 4
9 8 7 6 5
 */

    
}
