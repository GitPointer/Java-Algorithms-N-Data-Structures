package com.my.educative.dsa.graph;
import com.my.educative.dsa.linkedlist.DoublyLinkedListWithTail;
public class CycleInUndirected {

    public static void main(String[] args) {
        CycleInUndirected cycleInUndirected = new CycleInUndirected();
        Graph graph = new Graph(5);
        graph.addEdges(0, 1);
        graph.addEdges(1, 0);
        graph.addEdges(1, 2);
        graph.addEdges(2, 1);
        graph.addEdges(2, 3);
        graph.addEdges(2, 4);
        graph.addEdges(3, 2);
        graph.addEdges(3, 4);
        graph.addEdges(4, 3);
        graph.addEdges(4, 2);
        graph.printUndirectedGraph();
        System.out.println("Is Cycle present "+cycleInUndirected.isCycle(graph));
    }

    public boolean isCycle(Graph g){
        boolean[] visited = new boolean[g.vertices];
        for(int i = 0; i < g.vertices;i++){
             if(!visited[i]){
                if(dfs(g,i,visited,-1))return true;
             }
        }
        return  false;
    }

    public boolean dfs(Graph g, int source, boolean[] visited, int parent){
        visited[source]=true;
        DoublyLinkedListWithTail<Integer>.Node temp = null;
        if(g.adjacentList[source] != null)
        temp = g.adjacentList[source].headNode;
        while(temp != null){
            if(!visited[temp.data]){
                if(dfs(g,temp.data,visited,source)){
                    return true;
                }
            }else if(parent!=temp.data){
                return true;
            }
            temp = temp.nextNode;
        }
        return false;
    }

    
}
