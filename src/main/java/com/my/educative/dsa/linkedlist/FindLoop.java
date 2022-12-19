package com.my.educative.dsa.linkedlist;

import java.util.ArrayList;

public class FindLoop {
   public static void main (String[] args) {
    SinglyLinkedList<Integer> singlyLinkedList = singlyExecutor();
    FindLoop findLoop= new FindLoop();
    boolean result=findLoop.findLoop(singlyLinkedList);
    System.out.println("result::"+result);
      
   }
   public boolean findLoop(SinglyLinkedList<Integer> sll) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       SinglyLinkedList<Integer>.Node headNode = sll.getHead();
       while (headNode != null) {
         if (arr.contains(headNode.data)){
            return true;
         } else {
             arr.add(headNode.data);
             headNode = headNode.nextNode;
         }          
       }
    return false;
   }


 private static SinglyLinkedList<Integer> singlyExecutor() {
      SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();

      singlyLinkedList.insertAtHead(12);
      singlyLinkedList.insertAtHead(17);
      singlyLinkedList.insertAtHead(21);
      singlyLinkedList.insertAtHead(12);
      return singlyLinkedList;

  }


}