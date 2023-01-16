package com.my.educative.dsa.stack;
import java.util.Stack;

public class NextGreaterElement {
    Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
    NextGreaterElement nextGreaterElement = new NextGreaterElement();
    int[] arr = {4,6,3,2,8,1};
    int[] result = nextGreaterElement.findNextGreatElement(arr);
    for(int elem: result) {
        System.out.println(elem);
    }
        
    }

    public int[] findNextGreatElement(int[] arr) {
       int[] resultArr = new int [arr.length];
       for (int i = arr.length-1 ; i >= 0; i--){
        int val = -1;
           while (!stack.isEmpty()) {
             if (stack.peek() > arr[i]) {
                val = stack.peek();
                break;
             } else {
                stack.pop();
             }
           }
           stack.push(arr[i]);
           resultArr[i] = val;
       }
       return resultArr;
    }
    


}
