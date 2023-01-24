package com.my.educative.dsa.graph;
import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;

public class CycleInDirected {
  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdges(0, 1);
    g.addEdges(2, 1);
    g.addEdges(2, 3);
    g.addEdges(3, 4);
    g.addEdges(4, 2);
    CycleInDirected ccl = new CycleInDirected();
    boolean result = ccl.isCycle(g);
    System.out.println("Is it cycle: "+ result);
  }

  public boolean dfs(Graph g, int i, boolean[] visited, boolean[]recursion) {
   visited[i] = true;
   recursion[i] = true;
   DoublyLinkedListWithTail<Integer>.Node temp = null;
   if (g.adjacentList[i] != null) {
       temp = g.adjacentList[i].headNode;
   }
   while(temp != null) {
    if(!visited[temp.data])  {
        if (dfs(g, temp.data, visited, recursion)) {
            return true;
        } 
    } else if (recursion[temp.data]) {
        return true;
    }
     temp = temp.nextNode;
   }
   recursion[i] = false; 
   return false;
  }

  

  public boolean isCycle(Graph g) {
    boolean[] visited = new boolean[g.vertices];
    boolean[] recursion = new boolean[g.vertices];
      if(g.vertices < 1) {
        return false;
     }

     for(int i = 0; i < g.vertices; i++) {
        if(!visited[i]) {
            if (dfs(g, i, visited, recursion)) return true;
        }
     }

    return false;
  }




   

}