package com.my.educative.dsa.linkedlist;

public class LinkedListUtil {

public static void printSinglyLinkedList(SinglyLinkedList<Integer> singlyLinkedList){
    if (singlyLinkedList.size() > 0) {
      SinglyLinkedList<Integer>.Node headNode = singlyLinkedList.getHead();
      StringBuilder sb=new StringBuilder();
      while (headNode != null) {
         sb.append(headNode.data);
         if(headNode.nextNode!=null){
            sb.append("->");
         }
         headNode = headNode.nextNode;
      }
      System.out.println(sb.toString());
  }
  } 
}
