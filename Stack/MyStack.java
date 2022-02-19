package DS.Stack;
import java.util.Stack;

public class MyStack<E>{

    public static class StackNode<E>{
        E data;
        StackNode<E> next;

        public StackNode(E data){
            this.data = data;
            next = null;
        }
    }

    private StackNode<E> head;

    public void push(E e) {
        StackNode<E> toAdd = new StackNode<>(e);
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
        StackNode<E> popped = head;
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
