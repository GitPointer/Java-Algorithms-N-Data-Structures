package com.my.educative.dsa.graph;

import java.util.Stack;

import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;
import com.my.educative.dsa.stack.MyStack;

public class DFS {

    Stack<Integer> stack  = new Stack<Integer>();
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(1,3);
        g.addEdges(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("DFS traversal of Graph1 : " + dfs(g));
        System.out.println();
    }

    private static String dfs(Graph g) {
        String result = "";
        //Checking if the graph has no vertices
        if (g.vertices < 1){
            return result;
        }

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[g.vertices];
    
        for(int i=0; i<g.vertices; i++) 
        { 
            //Checking whether the node is visited or not 
            if(!visited[i]) 
            { 
                result = result + dfsVisit(g, i, visited); 
            } 
        }
        return result;
    }

    public static String dfsVisit(Graph g, int source, boolean[] visited) {
        String result = "";
        //Create Stack for Depth First Traversal and push source in it
        MyStack<Integer> stack = new MyStack<>(g.vertices);
        stack.push(source);
        visited[source] = true;
        //Traverse while Stack is not empty
        while (!stack.isEmpty()) {
            //Pop a vertex/node from stack and add it to result
            int current_node = stack.pop();
            result += String.valueOf(current_node);
            //Get adjacent vertices to the current_node from the array,
            //and if they are not already visited then push them in the Stack
            DoublyLinkedListWithTail<Integer>.Node temp = null;
            if(g.adjacentList[current_node] != null)
                temp = g.adjacentList[current_node].headNode;
            while (temp != null) {
                if (!visited[temp.data]) {
                    stack.push(temp.data);
                    visited[temp.data] = true; //Visit the current Node
                }
                temp = temp.nextNode;
            }
        }//end of while
        return result;
    }
}
