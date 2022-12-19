package com.my.educative.dsa.linkedlist;



public class ReverseLinkedList {
    public static void main (String[] args) {
        SinglyLinkedList<String> singlyLinkedList=singlyExecutor();
        if (singlyLinkedList.size() > 0) {
            SinglyLinkedList<String>.Node headNode = singlyLinkedList.getHead();
            while (headNode != null) {
               System.out.println(headNode.data);
               headNode = headNode.nextNode;
            }
        }
            System.out.println("---------------");
        singlyLinkedList.reverseLinkedList();
        System.out.println(singlyLinkedList.size());
        if (singlyLinkedList.size() > 0) {
            SinglyLinkedList<String>.Node  headNode = singlyLinkedList.getHead();
            while (headNode != null) {
               System.out.println(headNode.data);
               headNode = headNode.nextNode;
            }
 
        }
    }

   
   private static SinglyLinkedList<String> singlyExecutor() {
      SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

      singlyLinkedList.insertAtHead("Vikas");
      singlyLinkedList.insertAtHead("Keshav");
      singlyLinkedList.insertAtHead("Ujjval");
      singlyLinkedList.insertAtHead("Boopalan");
      return singlyLinkedList;

  }

  public static void reverseLinkedList() {
      
   

  }
}
