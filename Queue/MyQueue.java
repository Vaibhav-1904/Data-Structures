package DS.Queue;
// Queue Implementation using LinkedList
public class MyQueue<DataType>{

    public static class QueueNode<DataType>{
        DataType data;
        QueueNode<DataType> next;

        public QueueNode(DataType data){
            this.data = data;
            next = null;
        }
    }

    private QueueNode<DataType> head, rear;

    public void enqueue(DataType data) {
        QueueNode<DataType> toAdd = new QueueNode<>(data);
        if(head == null) {
            rear = head = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public QueueNode<DataType> dequeue() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        else if(head == rear) {
            QueueNode<DataType> temp = head;
            head = rear = null;
            return temp;
        }else{
            QueueNode<DataType> temp = head;
            head = head.next;
            return temp;
        }
    }

    public QueueNode<DataType> peek() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        return head;
    }
}
