package com.my.educative.dsa.linkedlist;

public class MiddleNodeOfLinkedList  {
   public static void main(String[] args) {
   SinglyLinkedList<Integer> singlyLinkedList = singlyExecutor();
   SinglyLinkedList<Integer>.Node  middleNode =  getMiddleNodeOptimizedSolution(singlyLinkedList);
   if (middleNode != null) {
      System.out.println("MiddleNode data is "+ middleNode.data);
   }
   }

   public static SinglyLinkedList<Integer>.Node  getMiddleNode(SinglyLinkedList<Integer> sll) {
      SinglyLinkedList<Integer>.Node headNode = sll.getHead();
      if (headNode == null) {
        return null;
      }
      int currNodeNum = 1;
      int size = sll.size();
      int nodeNum = 0;
      if (size != 0) {
          if (size % 2 == 0) {
             nodeNum = size/2;
          } else {
              nodeNum = (size/2) + 1;
          }
      }

      while (currNodeNum != nodeNum) {
            headNode = headNode.nextNode;
            currNodeNum++;
      }
      return headNode;
      
   }

     public static SinglyLinkedList<Integer>.Node  getMiddleNodeOptimizedSolution(SinglyLinkedList<Integer> sll) {
      SinglyLinkedList<Integer>.Node hare = sll.getHead(); 
      SinglyLinkedList<Integer>.Node tortoise = sll.getHead(); 

      while(hare != null && hare.nextNode != null) {
         hare = hare.nextNode.nextNode;
         if(hare!=null){
            tortoise = tortoise.nextNode;
         }
      }
      return tortoise;    
      }

  private static SinglyLinkedList<Integer> singlyExecutor() {
      SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
      singlyLinkedList.insertAtEnd(12);
      singlyLinkedList.insertAtEnd(17);
      singlyLinkedList.insertAtEnd(21);
      singlyLinkedList.insertAtEnd(15);
      //singlyLinkedList.insertAtEnd(13);
      return singlyLinkedList;

  }
}