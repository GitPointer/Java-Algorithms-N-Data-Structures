package com.my.educative.dsa.graph;

import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;
import com.my.educative.dsa.queue.MyQueue;

public class CycleUsingBFS {
    public static boolean bfs(Graph g){
      boolean result = false;
      //Checking if the graph has no vertices
      if (g.vertices < 1){
          return false;
      }
      //Boolean Array to hold the history of visited nodes (by default-false)
      boolean[] visited = new boolean[g.vertices];
      for(int i=0;i<g.vertices;i++)
      {
          //Checking whether the node is visited or not
          if(!visited[i])
          {
              result =  bfsVisit(g, i, visited);
          }
      }
      return result;
  }
  public static boolean bfsVisit(Graph g, int source, boolean[] visited) {
      boolean result = false;
      //Create Queue for Breadth First Traversal and enqueue source in it
      MyQueue<Integer> queue = new MyQueue<>(g.vertices);
      queue.enqueue(source);
      visited[source] = true;
      //Traverse while queue is not empty
      while (!queue.isEmpty()) {
          //Dequeue a vertex/node from queue and add it to result
          int current_node = queue.dequeue();
          //Get adjacent vertices to the current_node from the array,
          //and if they are not already visited then enqueue them in the Queue
          DoublyLinkedListWithTail<Integer>.Node temp = null;
          if(g.adjacentList[current_node] != null)
              temp = g.adjacentList[current_node].headNode;
          while (temp != null) {
              if (!visited[temp.data]) {
                  queue.enqueue(temp.data);
                  visited[temp.data] = true; //Visit the current Node
              } else {
                result = true;
              }
              temp = temp.nextNode;
          }
      }//end of while
      return result;
  }
  public static void main(String args[]) {
      Graph g = new Graph(3);
      g.addEdges(0,1);
      g.addEdges(1,2);
      g.addEdges(2,3);
      System.out.println("Graph1:");
      g.printGraph();
      System.out.println("Is Cyclic Graph : " + bfs(g));
      System.out.println();
}
}