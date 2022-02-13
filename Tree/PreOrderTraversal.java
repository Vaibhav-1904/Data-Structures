package DS.Tree;
import DS.Tree.Tree.TreeNode;
import java.util.*;

// root-left-right
public class PreOrderTraversal {

//    // Recursive Approach   T->O(N) number of nodes,  Auxiliary space-> O(n)
//    void preOrder(Node root){
//        if(root == null)
//            return;
//
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }

    // Iterative Approach
    // T -> O(n)   S-> O(n)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        if(root == null)
            return preOrder;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            preOrder.add(root.data);

            if(root.right != null)
                stack.push(root.right);
            if(root.left != null)
                stack.push(root.left);
        }
        return preOrder;
    }
}
