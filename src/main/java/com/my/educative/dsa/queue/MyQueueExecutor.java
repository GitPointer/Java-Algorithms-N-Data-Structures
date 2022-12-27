package com.my.educative.dsa.queue;

public class MyQueueExecutor {
    public static void main(String[] args) {
        MyQueueExecutor myQueueExecutor = new MyQueueExecutor();
        MyQueue<Integer> myQueue = myQueueExecutor.createQueue();
        System.out.println("myQueue isEmpty? " + myQueue.isEmpty());
        System.out.println("myQueue isFull? " + myQueue.isFull());
       // myQueue.enqueue(17);


        System.out.println("Dequeue " + myQueue.dequeue());

        myQueue.enqueue(16);
        System.out.println("myQueue isFull? " + myQueue.isFull());


    }


    public MyQueue<Integer> createQueue() {
     MyQueue<Integer> myQueue = new MyQueue<Integer>(5);
     myQueue.enqueue(2);
     myQueue.enqueue(3);
     myQueue.enqueue(4);
     myQueue.enqueue(5);
    myQueue.enqueue(6);
     return myQueue;
    }
}
