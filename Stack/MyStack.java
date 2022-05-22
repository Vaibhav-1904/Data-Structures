package DS.Stack;
import java.util.Stack;

public class MyStack<E>{

    public static class ListNode<E>{
        E data;
        ListNode<E> next;

        public ListNode(E data){
            this.data = data;
            next = null;
        }
    }

    private ListNode<E> head;

    public void push(E e) {
        ListNode<E> toAdd = new ListNode<>(e);
        if(head == null) {
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head = toAdd;
    }

    public E pop() throws Exception {
        if(head == null){
            throw new Exception("Stack is Empty");
        }
        ListNode<E> popped = head;
        head = head.next;

        return popped.data;
    }

    public E peek() throws Exception {
        if(head == null)
            throw new Exception("Stack is Empty");
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
    }
}
