package DS.Tree;
import DS.Tree.Tree.Node;
import java.util.*;

// left-right-root
public class PostOrderTraversal {
//    // Recursive Approach T->O(n)
//    void postOrder(Node root){
//        if(root == null)
//            return;
//
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.println(root.data + " ");
//    }

//    //Iterative using 2 Stacks
//    public List<Integer> postorderTraversal(Node root) {
//        Stack<Node> stack1 = new Stack<>();
//        Stack<Node> stack2 = new Stack<>();
//        List<Integer> postOrder = new ArrayList<>();
//        if(root == null)
//            return postOrder;
//        stack1.push(root);
//        while(!stack1.isEmpty()){
//            root = stack1.pop();
//            stack2.push(root);
//
//            if(root.left != null)
//                stack1.push(root.left);
//
//            if(root.right != null)
//                stack1.push(root.right);
//        }
//        while(!stack2.isEmpty()){
//            postOrder.add(stack2.pop().data);
//        }
//        return postOrder;
//    }

    // Iterative using 1 Stack
    // T->O(n)
public List<Integer> postorderTraversal(Node root) {
    Stack<Node> stack = new Stack<>();
    List<Integer> postOrder = new ArrayList<>();
    if(root == null)
        return postOrder;
    Node cur = root;

    while(cur != null || !stack.isEmpty()){
        if(cur != null){
            stack.push(cur);
            cur = cur.left;
        }else{
            Node temp = stack.peek().right;
            if(temp == null){
                temp = stack.pop();
                postOrder.add(temp.data);
                while(!stack.isEmpty() && stack.peek().right == temp){
                    temp = stack.pop();
                    postOrder.add(temp.data);
                }
            }else
                cur = temp;
        }
    }
    return postOrder;
}
}
