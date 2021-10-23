package DS.Graph;
import java.util.*;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> graph) {

        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V+1];
        // DisConnected Multi-Component Graph
        for(int i = 1; i <= V; i++){
            if(!visited[i]){
                DfsTraversal(i, graph, dfs, visited);
            }
        }
        return dfs;
    }

    void DfsTraversal(int vertex, ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> dfs, boolean[] visited){
        visited[vertex] = true;
        dfs.add(vertex);
        for(Integer v: graph.get(vertex)){
            // Go to depth of a Node and make sure it is not visited
            if(!visited[v])
                DfsTraversal(v, graph, dfs, visited);
        }
    }
}
