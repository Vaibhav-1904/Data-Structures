package DS.Queue;
// Queue Implementation using LinkedList
public class MyQueue<E>{

    public static class QueueNode<E>{
        E data;
        QueueNode<E> next;

        public QueueNode(E data){
            this.data = data;
            next = null;
        }
    }
    private QueueNode<E> head, rear;

    public void enqueue(E data) {
        QueueNode<E> toAdd = new QueueNode<>(data);
        if(head == null) {
            rear = head = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public QueueNode<E> dequeue() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        else if(head == rear) {
            QueueNode<E> temp = head;
            head = rear = null;
            return temp;
        }else{
            QueueNode<E> temp = head;
            head = head.next;
            return temp;
        }
    }

    public QueueNode<E> peek() throws Exception{
        if(head == null)
            return null;
        return head;
    }
}
