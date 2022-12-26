package com.my.educative.dsa.linkedlist;

public class PalindromeDLL {
    public static void main(String[] args) {
        PalindromeDLL palindromeDLL = new PalindromeDLL();
        DoublyLinkedList<Integer> dll = doulblyExecutor();
        boolean isPalindrome = palindromeDLL.isPalindrome(dll);
        System.out.println("Batao bhaiya " + isPalindrome);         
    }


    public boolean isPalindrome(DoublyLinkedList<Integer> dll) {
        DoublyLinkedList<Integer>.Node headNode = dll.getHead();
        DoublyLinkedList<Integer>.Node tailNode = dll.getHead();
        while (tailNode.nextNode != null) {
            tailNode = tailNode.nextNode;
        }

        while(headNode != null && tailNode != null && (headNode.nextNode != tailNode || headNode.nextNode != tailNode.prevNode)){
            if (headNode.data != tailNode.data) 
               return false;
            
            headNode = headNode.nextNode;
            tailNode = tailNode.prevNode;
        }
        return true;
    }


    private static  DoublyLinkedList<Integer> doulblyExecutor() {
        DoublyLinkedList<Integer>  doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.insertAtEnd(12);
        doublyLinkedList.insertAtEnd(23);
        doublyLinkedList.insertAtEnd(24);
        doublyLinkedList.insertAtEnd(25);
        doublyLinkedList.insertAtEnd(24);
        doublyLinkedList.insertAtEnd(23);
        doublyLinkedList.insertAtEnd(12);

        return doublyLinkedList;
    }

}


