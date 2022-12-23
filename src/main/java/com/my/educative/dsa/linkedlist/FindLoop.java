package com.my.educative.dsa.linkedlist;

import java.util.ArrayList;

public class FindLoop {
   public static void main (String[] args) {
    SinglyLinkedList<Integer> singlyLinkedList = singlyExecutor();
    FindLoop findLoop= new FindLoop();
    SinglyLinkedList<Integer>.Node node = findLoop.findIntersectedNodeUsingFCD(singlyLinkedList);
    if(node!= null){
      System.out.println("------------------------------------");
      System.out.println("Ohh My Good!! Loop found in LinkedList.No worry i will handle it properly using FCD algorithm");
      System.out.println("FCD's Hare and Tortoise are Intersecting at::"+ node.data);
      //Get First Node of Loop
      SinglyLinkedList<Integer>.Node firstNodeofLoop  = findLoop.getFirstNodeOfLoop(singlyLinkedList, node);
      System.out.println("Loop's Starting Node is:"+firstNodeofLoop.data);
      //Remove Loop
      findLoop.removeLoopFromLinkedList(firstNodeofLoop);
      //PrintLinkList
      LinkedListUtil.printSinglyLinkedList(singlyLinkedList);
    }else{
      System.out.println("There is no Loop in this LinkedList");
      LinkedListUtil.printSinglyLinkedList(singlyLinkedList);
    }
    System.out.println("------------------------------------");
   }
   public boolean findLoopInLinkedList(SinglyLinkedList<Integer> sll) {
       ArrayList<SinglyLinkedList<Integer>.Node> arr = new ArrayList<SinglyLinkedList<Integer>.Node>();
       SinglyLinkedList<Integer>.Node headNode = sll.getHead();
       while (headNode != null) {
         if (arr.contains(headNode)){
            return true;
         } else {
             arr.add(headNode);
             headNode = headNode.nextNode;
         }          
       }
    return false;
   }


  public SinglyLinkedList<Integer>.Node getFirstNodeOfLoop(SinglyLinkedList<Integer> sll, SinglyLinkedList<Integer>.Node intersectedNode) {
        SinglyLinkedList<Integer>.Node tortoise = sll.getHead();
        SinglyLinkedList<Integer>.Node hare = intersectedNode;
        while(hare.nextNode != null) {
           tortoise = tortoise.nextNode;
           hare = hare.nextNode;
           if (tortoise == hare) {
              return hare;
           }
        }
        return null;
  } 


   public void removeLoopFromLinkedList(SinglyLinkedList<Integer>.Node firstNodeofLoop) {
        SinglyLinkedList<Integer>.Node temp = firstNodeofLoop;
        while(temp.nextNode != firstNodeofLoop) {
              temp = temp.nextNode;
        }
        temp.nextNode = null;
  } 


public SinglyLinkedList<Integer>.Node  findIntersectedNodeUsingFCD(SinglyLinkedList<Integer> sll) {
        SinglyLinkedList<Integer>.Node tortoise = sll.getHead();
        SinglyLinkedList<Integer>.Node hare = sll.getHead();
       while (hare.nextNode!= null) {
             tortoise = tortoise.nextNode;
             hare = hare.nextNode.nextNode;
             if (tortoise == hare) {
                 return hare;
             }
       }
    return null;
   }



 private static SinglyLinkedList<Integer> singlyExecutor() {
      SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
      singlyLinkedList.insertAtEnd(12);
      singlyLinkedList.insertAtEnd(17);
      singlyLinkedList.insertAtEnd(21);
      singlyLinkedList.insertAtEndAndLinkTo(15,17);
      return singlyLinkedList;

  }




}