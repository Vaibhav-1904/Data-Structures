package DS.Heap;


import java.util.*;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // By-Default it is Min Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //comparator is passed
        
        minHeap.add(10); maxHeap.add(10);
        minHeap.add(5);  maxHeap.add(5);
        minHeap.add(2);  maxHeap.add(2);
        System.out.println(minHeap.peek());
        System.out.println(maxHeap.peek());


    }
}
