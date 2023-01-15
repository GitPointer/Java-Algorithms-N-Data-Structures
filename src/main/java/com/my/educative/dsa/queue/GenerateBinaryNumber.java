package com.my.educative.dsa.queue;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        GenerateBinaryNumber generateBinaryNumber = new GenerateBinaryNumber();
        String[] result = generateBinaryNumber.generateBinaryNumber(15);
        for (String item : result){
            System.out.println(item);
        }
    }

    public String[] generateBinaryNumber(int number) {
       String[] result = new String[number];
       MyQueue<String> myQueue = new MyQueue<String>(number + 1);
       myQueue.enqueue("1");
       for (int i = 0; i < number; i++) {
            result[i] = myQueue.dequeue(); // 1st "1", 2nd "10", 3rd "11", 4th "100", 5th "101"
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            myQueue.enqueue(s1); // 1st "10", 2nd "100", 3rd "110", 4th "1000", 5th "1010"
            myQueue.enqueue(s2); // 1st "11", 2nd "101", 3rd "111", 4th "1001", 5th "1011"
       }
        return result;
    }
}
