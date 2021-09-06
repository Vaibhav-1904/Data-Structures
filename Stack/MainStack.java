package DS.Stack;

public class MainStack {
    public static void main(String[] args) throws Exception {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.pop() + "  " + stack.peek());
//        stack.pop();
//        System.out.println(stack.isEmpty());
//        stack.pop();
//        System.out.println(stack.isEmpty());
//        stack.pop();

        MyStackUsingArray s = new MyStackUsingArray();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop() + "   " + s.peek());

    }
}
