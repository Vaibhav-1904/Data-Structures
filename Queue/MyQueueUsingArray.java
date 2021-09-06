package DS.Queue;

public class MyQueueUsingArray {
    int[] arr;
    int front , rear;
    int size; int count;

    public MyQueueUsingArray(int size){
        this.size = size;
        front = rear = 0;
        arr = new int[size];
        count = 0;
    }

    public void enqueue(int data) throws Exception{
        if(count == size)
            throw new Exception("Queue is Full");

        arr[rear % size] = data;
        rear++;
        count++;
    }

    public int dequeue() throws Exception{
        if(count == 0) {
            throw new Exception("Queue is Empty");
        }
        int temp = arr[front % size];
        arr[front % size] = -1;
        front++;
        count--;

        return temp;
    }

    public int peek() throws Exception{
        if(count == 0) {
            throw new Exception("Queue is Empty");
        }
        return arr[front % size];
    }

    void printQueue(){
        for(int i = front; i < rear - 1; i++){
            System.out.println(arr[i % size]);
        }
    }
}
