package DS.Stack;
import java.util.Stack;

public class MyStack<E>{

    public static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }

    private Node<E> head;

    public void push(E e){
        Node<E> toAdd = new Node<>(e);
        if(head == null)
            head = toAdd;
        toAdd.next = head;
        head = toAdd;
    }

    public E pop() throws Exception {
        if(head == null){
            throw new Exception("Stack is Empty");
        }
        Node<E> popped = head;
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
