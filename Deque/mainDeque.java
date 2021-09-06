package DS.Deque;

import java.util.*;

public class mainDeque {

    public static void main(String[] args){

        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> arr = new LinkedList<>();
        MyDeque<Integer> d = new MyDeque<>();

        for(int i = 0; i < 10; i++){
            d.addToTail(i);
        }

        d.removeFromTail();
        d.removeFromHead();
        d.print(d.head);


    }
}
