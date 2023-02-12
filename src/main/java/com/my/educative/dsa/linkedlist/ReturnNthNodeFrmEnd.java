package com.my.educative.dsa.linkedlist;

public class ReturnNthNodeFrmEnd {
    public static void main(String[] args) {
        ReturnNthNodeFrmEnd returnNthNode = new ReturnNthNodeFrmEnd() ;
        SinglyLinkedList<Integer> singlyExecutor = singlyExecutor();
        int nthNodeData = returnNthNode.returnTheNthNode(singlyExecutor, 10);
        System.out.println("Node date is " + nthNodeData);

    }

    public int returnTheNthNode(SinglyLinkedList<Integer> sll, int n ) {
        SinglyLinkedList<Integer>.Node prev = sll.getHead();
        SinglyLinkedList<Integer>.Node curr = sll.getHead();

        if (sll.isEmpty()) {
            return -1;
        }

        for (int i = 0; i<n-1; i ++) {
            if (curr == null)
                return -1;
            curr = curr.nextNode;
        }
        while (curr.nextNode != null) {
            curr = curr.nextNode;
            prev = prev.nextNode;
        }

     return prev.data;
    }




    private static SinglyLinkedList<Integer> singlyExecutor() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.insertAtEnd(12);
        singlyLinkedList.insertAtEnd(17);
        singlyLinkedList.insertAtEnd(21);
        singlyLinkedList.insertAtEnd(15);
        singlyLinkedList.insertAtEnd(18);
        singlyLinkedList.insertAtEnd(33);
        singlyLinkedList.insertAtEnd(25);
        singlyLinkedList.insertAtEnd(37);
        return singlyLinkedList;
    }



}
