package DS.Graph;
import java.util.*;

public class BFS {
    // 1 based Indexing
    // T = O(N + E)  ,  S = O(N + N)
    public List<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> graph) {
        // Adjacency List is already given
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];

        // Multiple component Dis-Connected Graphs
        for(int i = 1; i <= V; i++){
            if(!visited[i]){

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                // Visit every node of a component
                while(!q.isEmpty()) {
                    Integer current = q.poll();
                    bfs.add(current);
                    // To add every adjacent node of current Node
                    for(Integer j : graph.get(current)){
                        if(!visited[j]){
                            visited[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        int n = 3; // Number of vertexes/Nodes
        int m = 3; // Number of edges
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
    }
}
