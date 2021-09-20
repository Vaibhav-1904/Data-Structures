package DS.Graph;

import java.util.ArrayList;

public class graph {
    public static void main(String[] args) {
        // ArrayList method
        int n = 3; // Number of vertexes/Nodes
        int m = 3; // Number of edges
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        // A Triangle Undirected Graph of 1,2,3

        // edge 1---2
        graph.get(1).add(2);
        graph.get(2).add(1);

        // edge 2---3
        graph.get(2).add(3);
        graph.get(3).add(2);

        //edge 3---1
        graph.get(3).add(1);
        graph.get(1).add(3);

        // graph.get(u).add(v);
        // graph.get(v).add(u);

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
