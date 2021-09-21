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

    void DfsTraversal(int i, ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> dfs, boolean[] visited){
        visited[i] = true;
        dfs.add(i);
        for(Integer j: graph.get(i)){
            // Go to depth of a Node and make sure it is not visited
            if(!visited[j])
                DfsTraversal(j, graph, dfs, visited);
        }
    }
}
