package com.my.educative.dsa.linkedlist;

public class DoublyLinkedList<T> implements LinkedListInterface<T>{


    class Node{
        T data;
        Node nextNode;
        Node prevNode;

    }

    Node headNode;
    private int size;

    public DoublyLinkedList() {
        headNode = null;
        size = 0;
    }

    public Node getHead() {
        return headNode;
    }

    @Override
    public void insertAtHead(T data) {
        Node newHeadNode = new Node();
        newHeadNode.prevNode = null;
        newHeadNode.data = data;
        newHeadNode.nextNode = headNode;
     if (!isEmpty()) {
        headNode.prevNode = newHeadNode;
     } 
       headNode = newHeadNode;
       size++;
        
    }

    public void deleteAtHeadEduc(){
        //if list is empty do nothing
        if(isEmpty())
            return;
        
        //if List is not empty then link head to the
        //nextElement of firstElement.
        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
    }

    @Override
    public Boolean isEmpty() {
      if (headNode == null)
        return true;
      return false;
    }

    @Override
    public void deleteAtHead() {
       if(!isEmpty()){
        headNode = headNode.nextNode;
        if(headNode!= null){
          headNode.prevNode = null;
         }
         size--;
       }
        
    }

    @Override
    public void deleteWithValue(T data) {
       Node currNode = headNode;
       if (isEmpty()) {
           return;
       }
       if (headNode.data.equals(data)) {
           deleteAtHead();
           return;
       }
       
       while(currNode!= null && !currNode.data.equals(data)){
          currNode = currNode.nextNode;
       }
       if (currNode != null) {
           currNode.prevNode.nextNode = currNode.nextNode;
           currNode.nextNode.prevNode = currNode.prevNode;
           size--;
       }
        
    }

    @Override
    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            return;
        }
        Node currNode= headNode;
        while(currNode!=null && !currNode.data.equals(previous)){
            currNode=currNode.nextNode;
        }
        if(currNode!=null){
            newNode.nextNode=currNode.nextNode;
            newNode.prevNode=currNode;
            if(currNode.nextNode!=null){
                currNode.nextNode.prevNode=newNode;
            }
            currNode.nextNode=newNode;
            size++;
        }
    }

    @Override
    public void insertAtEnd(T data) {
        Node currNode = headNode;
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
           insertAtHead(data);
           return;
        }
        while (currNode.nextNode != null) {
             currNode = currNode.nextNode;
        }

        currNode.nextNode = newNode;
        newNode.prevNode = currNode;
        size++;       
    }



    @Override
    public boolean searchNode(T data) {
        Node currNode = headNode;
        if (isEmpty()) {
            return false;
        }
        while (currNode != null && !currNode.data.equals(data)) {
            currNode = currNode.nextNode;
        }

        if (currNode != null) {
            return true;
        }

        return false;
    }

    @Override
    public int size() {
         return size;
    }

    @Override
    public void deleteAtEnd() {
      Node currNode =  headNode;
       if(!isEmpty()) {
          if (size ==1 ){
              deleteAtHead();
              return;
          }
          while (currNode.nextNode != null) {
              currNode = currNode.nextNode;
          }
        currNode.prevNode.nextNode = null;
        size--;
       }
        
    }
    
}