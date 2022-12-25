package com.my.educative.dsa.linkedlist;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        UnionAndIntersection unionAndIntersection = new UnionAndIntersection();
        SinglyLinkedList<Integer> ssl1=singlyExecutor();
        System.out.println("-------------Linkled List-1(Union)------------------");
        LinkedListUtil.printSinglyLinkedList(ssl1);  
        SinglyLinkedList<Integer> ssl2 = singlyExecutor2();
        System.out.println("-------------Linkled List-2(Union)------------------");
        LinkedListUtil.printSinglyLinkedList(ssl2);  
        SinglyLinkedList<Integer> union = unionAndIntersection.unionOfLinkedList(ssl1, ssl2);
        System.out.println("-------------Union of Linkled List------------------");
        LinkedListUtil.printSinglyLinkedList(union);     
        ssl1=singlyExecutor();
        System.out.println("-------------Linkled List-1(Intersection)------------------");
        LinkedListUtil.printSinglyLinkedList(ssl1);  
        ssl2 = singlyExecutor2();
        System.out.println("-------------Linkled List-2(Intersection)------------------");
        LinkedListUtil.printSinglyLinkedList(ssl2); 
      
        SinglyLinkedList<Integer> intersection = unionAndIntersection.intersectionOfLinkedList(ssl1,ssl2);
        System.out.println("-------------Intersection of Linkled List------------------");
        LinkedListUtil.printSinglyLinkedList(intersection);    
    }

    public SinglyLinkedList<Integer> unionOfLinkedList(SinglyLinkedList<Integer> sll1, SinglyLinkedList<Integer> sll2) {
     SinglyLinkedList<Integer>.Node currNode = sll1.getHead(); 

     if (sll1.isEmpty()) {
        return sll2;
     } else if (sll2.isEmpty()) {
        return sll1;
     }
     while (currNode.nextNode != null) {
           currNode = currNode.nextNode;
     }
     currNode.nextNode = sll2.getHead();
     RemoveDuplicate.removeDuplicate(sll1);
     return sll1;
    }



    public SinglyLinkedList<Integer> intersectionOfLinkedList(SinglyLinkedList<Integer> sll1, SinglyLinkedList<Integer> sll2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        SinglyLinkedList<Integer>.Node currNodeOfSll2 = sll2.getHead();
        SinglyLinkedList<Integer>.Node currNodeOfSll1 = sll1.getHead();
        SinglyLinkedList<Integer> result = new SinglyLinkedList<Integer>();

        while(currNodeOfSll2 != null) {
           hashSet.add(currNodeOfSll2.data);
           currNodeOfSll2 = currNodeOfSll2.nextNode;
        }
        while (currNodeOfSll1 != null){
           if(hashSet.contains(currNodeOfSll1.data)) {
              result.insertAtHead(currNodeOfSll1.data);
           }
           currNodeOfSll1 = currNodeOfSll1.nextNode;
        }
        return result;

       }


    private static SinglyLinkedList<Integer> singlyExecutor() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.insertAtEnd(12);
        singlyLinkedList.insertAtEnd(17);
        singlyLinkedList.insertAtEnd(21);
        singlyLinkedList.insertAtEnd(15);
        return singlyLinkedList;
    }

    private static SinglyLinkedList<Integer> singlyExecutor2() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.insertAtEnd(13);
        singlyLinkedList.insertAtEnd(19);
        singlyLinkedList.insertAtEnd(22);
        singlyLinkedList.insertAtEnd(15);
        return singlyLinkedList;
    }

}
