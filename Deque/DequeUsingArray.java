package DS.Deque;

public class DequeUsingArray {
    int[] arr;
    int  front;
    int  rear;
    int  size;
    int count;

    public DequeUsingArray(int size)
    {
        arr = new int[size];
        front = -1;
        rear = 0;
        this.size = size;
        count = 0;
    }

    void addFirst(int data) throws Exception{
        if(count == size)
            throw new Exception("Deque is Full");
        // IF deque is empty
        if(front == -1)
            front = rear = 0;
        else if(front == 0)
            front = size - 1;
        else
            front--;

        arr[front] = data;
        count++;
    }

    void addLast(int data) throws Exception{
        if(count == size)
            throw new Exception("Deque is Full");

        // If deque is Empty
        if(front == -1)
            front = rear = 0;
        else if(rear == size - 1)
            rear = 0;
        else
            rear++;

        arr[rear] = data;
        count++;
    }

    void removeFirst() throws Exception {
        if(count == 0)
            throw new Exception("Deque is Empty");
        // Deque has only 1 Element
        if(front == rear)
            front = rear = -1;
        else{
            if(front == size - 1)
                front = 0;
            else
                front++;
        }
        count--;
    }

    void removeLast() throws Exception {
        if(count == 0)
            throw new Exception("Deque is Empty");
        // Deque has only 1 Element
        if(front == rear)
            front = rear = -1;
        else{
            if(rear == 0)
                rear = size - 1;
            else
                rear--;
        }
        count--;
    }

    int peekFront() throws Exception {
        if(count == 0)
            throw new Exception("Deque is Empty");

        return arr[front];
    }

    int peekRear() throws Exception {
        if(count == 0)
            throw new Exception("Deque is Empty");

        return arr[rear];
    }

    public static void main(String[] args) {
        DequeUsingArray dq = new DequeUsingArray(3);

    }
}
