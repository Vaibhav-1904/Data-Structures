package DS.Queue;
import java.util.*;
public class MainQueue {
    public static void main(String[] args) throws Exception{
//        Queue<Integer> q = new LinkedList<>();
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        System.out.println(q.element());
//        System.out.println(q.peek());


//        MyQueue<Integer> q = new MyQueue<>();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        System.out.println(q.dequeue().data);

        MyQueueUsingArray q = new MyQueueUsingArray(3);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println("Topmost Element : " + q.peek()); // 1
        System.out.println( "Removed Element :" + q.dequeue());// 1
        q.enqueue(5);
        q.enqueue(6);
        System.out.println( "Removed Element :" + q.dequeue());
        System.out.println( "Removed Element :" + q.dequeue());
        System.out.println( "Removed Element :" + q.dequeue());
        System.out.println( "Removed Element :" + q.dequeue());
        q.enqueue(10);
        q.enqueue(11);
    }
}
