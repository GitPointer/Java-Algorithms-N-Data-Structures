package com.my.educative.dsa.linkedlist; 


public class SinglyLinkedListWithTail<T> implements LinkedListInterface<T>{

    class Node {
        T data;
        Node nextNode;
    }

    Node headNode;
    private int size;
    Node tailNode;

    public SinglyLinkedListWithTail() {
        headNode = null;
        size = 0;
        tailNode = null;
    }

    

    public Node getHead() {
        return headNode;
    }
    
     public Node getTail() {
        return tailNode;
    }

    @Override
    public void insertAtHead(T data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty()) {
            tailNode = node;
        }
        node.nextNode = headNode;
        headNode = node;  
        size++;
        
    }



    @Override
    public void insertAtEnd(T data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty()){
            insertAtHead(data); 
        }else{
            Node temp = headNode;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = node;
            tailNode = temp.nextNode;
        }
        
        size++;
        
    }



    @Override
    public void insertAfter(T data, T previous) {
        Node node = new Node();
        node.data = data;

        Node currentNode = headNode;
        while (currentNode != null && !currentNode.data.equals(previous)) {
             currentNode = currentNode.nextNode;
        }

        if (currentNode != null) {
            node.nextNode  = currentNode.nextNode;
            currentNode.nextNode = node;
            if (node.nextNode == null) {
                tailNode = node;
            }
            size++;
        }
        
    }



    @Override
    public boolean searchNode(T data) {
      var currNode = headNode;
      while (currNode != null) {
          if (currNode.data.equals(data)) {
            return true;
          }
          currNode = currNode.nextNode;
      }
      return false;
    }



    @Override
    public void deleteAtHead() {
        if (headNode != null) {
          headNode = headNode.nextNode;
          if (headNode == null) {
              tailNode = headNode;
          }
          size--;
       }
        
    }



    @Override
    public void deleteWithValue(T data) {
       Node currNode = headNode;
       Node prevNode  = null;
       if(isEmpty()){
          return;
       }
       if(currNode.data.equals(data)){
        deleteAtHead();
        size--;
        return;
      }
       while(currNode!=null){
        if(currNode.data.equals(data)){
            prevNode.nextNode = currNode.nextNode;
             if (currNode.nextNode == null){
                 tailNode = prevNode;
             }
            size--;
            return;
        }
        prevNode=currNode;
        currNode= currNode.nextNode;
    
       }
        
    }



    @Override
    public int size() {
        return size;
    }



    @Override
    public Boolean isEmpty() {
        if (headNode == null)
            return true;
        return false;
    }



    @Override
    public void deleteAtEnd() {
        Node currNode = headNode;
        Node prevNode = null;
        
        if(!isEmpty()) {
            if (size() == 1) {
                deleteAtHead();
                return;
            }
            while (currNode.nextNode != null) {
                  prevNode = currNode;
                  currNode = currNode.nextNode;
            }
            prevNode.nextNode = null;
            tailNode = prevNode;
            size--;            
        }
        
    }

}
