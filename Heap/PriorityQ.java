package DS.Heap;


import java.util.*;

public class PriorityQ {

    public static void main(String[] args) {
        int[][] price = {{3,4},{1,2},{7,8},{2,3}};

        System.out.println(Arrays.deepToString(price));

        Arrays.sort(price, (a, b) -> a[0] - b[0]);

        System.out.println(Arrays.deepToString(price));
    }
}
