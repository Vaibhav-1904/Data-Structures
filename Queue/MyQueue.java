package DS.Queue;
// Queue Implementation using LinkedList
public class MyQueue<DataType>{

    public static class ListNode<DataType> {
        DataType data;
        ListNode<DataType> next;

        public ListNode(DataType data){
            this.data = data;
            next = null;
        }
    }

    private ListNode<DataType> head, rear;

    public void enqueue(DataType data) {
        ListNode<DataType> toAdd = new ListNode<>(data);
        if(head == null) {
            rear = head = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public ListNode<DataType> dequeue() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        else if(head == rear) {
            ListNode<DataType> temp = head;
            head = rear = null;
            return temp;
        }else{
            ListNode<DataType> temp = head;
            head = head.next;
            return temp;
        }
    }

    public ListNode<DataType> peek() throws Exception{
        if(head == null)
            throw new Exception("Queue is Empty");
        return head;
    }
}
