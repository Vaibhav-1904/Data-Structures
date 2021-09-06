package DS.Graph;

import java.util.*;

public class bfs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, List<Integer>> g = new HashMap<>(); // used for graph
        for(int i = 1; i < 6; i++){
            g.put(i,new ArrayList<>());
        }

        g.get(1).add(2);
        g.get(1).add(5);
        g.get(2).add(1);
        g.get(2).add(3);
        g.get(3).add(5);
        g.get(3).add(4);
        g.get(3).add(1);
        g.get(4).add(3);
        g.get(4).add(5);
        g.get(5).add(1);
        g.get(5).add(3);
        g.get(5).add(4);


        System.out.println(g);

    }
}
