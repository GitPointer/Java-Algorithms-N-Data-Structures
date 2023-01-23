package com.my.educative.dsa.graph;

import java.util.Queue;

import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;
import com.my.educative.dsa.queue.MyQueue;

public class BFS {
    public static String bfs(Graph g){
      String result = "";
      //Checking if the graph has no vertices
      if (g.vertices < 1){
          return result;
      }
      //Boolean Array to hold the history of visited nodes (by default-false)
      boolean[] visited = new boolean[g.vertices];
      for(int i=0;i<g.vertices;i++)
      {
          //Checking whether the node is visited or not
          if(!visited[i])
          {
              result = result + bfsVisit(g, i, visited);
          }
      }
      return result;
  }
  public static String bfsVisit(Graph g, int source, boolean[] visited) {
      String result = "";
      //Create Queue for Breadth First Traversal and enqueue source in it
      MyQueue<Integer> queue = new MyQueue<>(g.vertices);
      queue.enqueue(source);
      visited[source] = true;
      //Traverse while queue is not empty
      while (!queue.isEmpty()) {
          //Dequeue a vertex/node from queue and add it to result
          int current_node = queue.dequeue();
          result += String.valueOf(current_node);
          //Get adjacent vertices to the current_node from the array,
          //and if they are not already visited then enqueue them in the Queue
          DoublyLinkedListWithTail<Integer>.Node temp = null;
          if(g.adjacentList[current_node] != null)
              temp = g.adjacentList[current_node].headNode;
          while (temp != null) {
              if (!visited[temp.data]) {
                  queue.enqueue(temp.data);
                  visited[temp.data] = true; //Visit the current Node
              }
              temp = temp.nextNode;
          }
      }//end of while
      return result;
  }
  public static void main(String args[]) {
      Graph g = new Graph(5);
      g.addEdges(0,1);
      g.addEdges(0,2);
      g.addEdges(1,3);
      g.addEdges(1,4);
      System.out.println("Graph1:");
      g.printGraph();
      System.out.println("BFS traversal of Graph1 : " + bfs(g));
      System.out.println();
      Graph g2 = new Graph(5);
      g2.addEdges(0,1);
      g2.addEdges(0,4);
      g2.addEdges(1,2);
      g2.addEdges(3,4);
      System.out.println("Graph2:");
      g2.printGraph();
      System.out.println("BFS traversal of Graph2 : " + bfs(g2));
}
}
