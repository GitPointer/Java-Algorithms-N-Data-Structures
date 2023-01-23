package com.my.educative.dsa.graph;

import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;

public class Graph {
   int vertices;
   DoublyLinkedListWithTail<Integer>[] adjacentList;

   public Graph(int vertices) {
     this.vertices = vertices;
     this.adjacentList = new DoublyLinkedListWithTail[vertices];
     

     for(int i = 0; i< vertices; i++){
        adjacentList[i] = new DoublyLinkedListWithTail<Integer>();
     }
   }

   public void addEdges(int source, int destination) {
     if (source < vertices && destination < vertices) {
        adjacentList[source].insertAtEnd(destination);
     }
   }


   public void printGraph() {
     System.out.println(">>>Adjancey is of directed graph<<<<<");
     for(int i = 0; i< vertices; i++) {
       if (adjacentList[i] != null) {
        System.out.print("|"+i+"|=>");
          DoublyLinkedListWithTail<Integer>.Node tmp = adjacentList[i].getHeadNode();
          while(tmp != null ) {
            System.out.print("["+tmp.data+"]->");
            tmp = tmp.nextNode;
          }
          System.out.println("Null");
       } else {
        System.out.println("|"+i+"|=>"+"null");
       }
     }     
   }
}
