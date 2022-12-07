package com.my.educative.dsa.linkedlist; 


public class LinkedListExecutor {
   public static void main(String[] args) {
     var singlyLinkedList = new SinglyLinkedList<String>();
     SinglyLinkedList<String>.Node headNode = singlyLinkedList.new Node();
     headNode.data = "Start";
     
     SinglyLinkedList<String>.Node next1Node = singlyLinkedList.new Node();
     next1Node.data="Keshav";
     headNode.nextNode=next1Node;
     
     
     SinglyLinkedList<String>.Node next2Node = singlyLinkedList.new Node();
     next2Node.data="Vikas";
     next1Node.nextNode=next2Node;
     SinglyLinkedList<String>.Node currentNode = headNode;
    do {
       System.out.println(currentNode.data);
       currentNode = currentNode.nextNode;
    } while(currentNode!= null) ;
     

   }  
} 