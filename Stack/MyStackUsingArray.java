package DS.Stack;

public class MyStackUsingArray {
    int[] arr = new int[100];
    int top = -1;

    void push(int x) throws Exception {
        if(top < arr.length - 1)
            arr[++top] = x;
        else
            throw new Exception("Stack is full!");
    }

    int pop() throws Exception {
        if(top == -1)
            throw new Exception("Stack is full!");
        return arr[top--];
    }

    int peek() throws Exception {
        if(top == -1)
            throw new Exception("Stack is full!");
        return arr[top];
    }
}
