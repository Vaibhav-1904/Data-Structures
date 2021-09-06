package DS.Queue;
// Queue Implementation using LinkedList
public class MyQueue<E>{

    public static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }
    private Node<E> head, rear;

    public void enqueue(E data){
        Node<E> toAdd = new Node<>(data);
        if(head == null){
            rear = head = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public Node<E> dequeue() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        else if(head == rear){
            Node<E> temp = head;
            head = rear = null;
            return temp;
        }else{
            Node<E> temp = head;
            head = head.next;
            return temp;
        }
    }

    public Node<E> peek() throws Exception{
        if(head == null)
            return null;
        return head;
    }
}
