package com.my.educative.dsa.linkedlist;

import java.util.HashSet;

public class RemoveDuplicate {
   public static void main(String[] args) {
      RemoveDuplicate removeDuplicate = new RemoveDuplicate() ;
      SinglyLinkedList<Integer> singlyLinedList = singlyExecutor();
      System.out.println("Before Removing------------");
      LinkedListUtil.printSinglyLinkedList(singlyLinedList);     
      removeDuplicate.removeDuplicate(singlyLinedList);
      System.out.println("After Removing------------");
      LinkedListUtil.printSinglyLinkedList(singlyLinedList);     
   }

   public void removeDuplicate(SinglyLinkedList<Integer> sll) {
   HashSet<Integer> hashset = new HashSet<Integer>();
   SinglyLinkedList<Integer>.Node currNode = sll.getHead();
   SinglyLinkedList<Integer>.Node prevNode = null;

   while (currNode != null) {
     if (hashset.contains(currNode.data)) {
        prevNode.nextNode = currNode.nextNode;        
     } else {
       prevNode = currNode;
       hashset.add(currNode.data);
     }
     currNode = currNode.nextNode;
     
   }
   


   }

   private static SinglyLinkedList<Integer> singlyExecutor() {
    SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
    singlyLinkedList.insertAtEnd(12);
    singlyLinkedList.insertAtEnd(17);
    singlyLinkedList.insertAtEnd(14);
    singlyLinkedList.insertAtEnd(21);
    singlyLinkedList.insertAtEnd(22);
    singlyLinkedList.insertAtEnd(14);
    singlyLinkedList.insertAtEnd(22);

    return singlyLinkedList;

}


}