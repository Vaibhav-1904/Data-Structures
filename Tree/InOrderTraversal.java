package DS.Tree;
import DS.Tree.Tree.Node;
import java.util.*;

// left-root-right
public class InOrderTraversal {
//    // Recursive T->O(n)
//    void inOrder(Node root){
//        if(root == null)
//            return;
//
//        inOrder(root.left);
//        System.out.println(root.data + " ");
//        inOrder(root.right);
//    }

    //Iterative T->O(n) S->O(n)
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> inOrder = new ArrayList<>();
        if(root == null)
            return inOrder;

        Stack<Node> stack = new Stack<>();
        Node node = root;

        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty())
                    break;

                node = stack.pop();
                inOrder.add(node.data);
                node = node.right;
            }
        }
        return inOrder;
    }
}
