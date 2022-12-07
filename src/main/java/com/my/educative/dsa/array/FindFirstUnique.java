package com.my.educative.dsa.array;
import java.util.*;


public class FindFirstUnique {
    public static void main(String[] args) {
        FindFirstUnique findFirstUnique = new FindFirstUnique();
        // int[] arr = {9, 2, 3, 2, 6, 6};
        int[] arr = {4, 5, 1, 2, 0, 4};
        int result = findFirstUnique.findFirstUnique(arr);
        System.out.println(result);
        
 
    }

    public int findFirstUnique(int[] arr) {
     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     
     for (int index = 0; index < arr.length; index++) {
          int count = 1;
          if (map.containsKey(arr[index])) {
              count = count + map.get(arr[index]);
          }
          map.put(arr[index], count);
     } 

     for (int i: arr) {
         if (map.get(i) == 1) {
            return i;
         } 
     }


     return -1;
     
    }
}