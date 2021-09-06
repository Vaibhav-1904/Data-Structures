package DS.Stack;

public class MyStackUsingArray{
    int[] arr = new int[100];
    int top = -1;

    void push(int x) {
        if(top < arr.length - 1)
            arr[++top] = x;
    }

    int pop(){
        if(top == -1)
            return -1;
        return arr[top--];
    }

    int peek() {
        if(top == -1)
            return -1;
        return arr[top];
    }
}
