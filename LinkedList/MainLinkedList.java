package DS.LinkedList;
import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> arr = new MyLinkedList<>();
        for(int i = 1; i <= 5; i++)
            arr.add(i);
        arr.remove(3);

        arr = arr.reverse(arr.head);

        arr.printLinkedList();
        System.out.println();
        arr.printReversedLinkedList(arr.head);
    }
}
