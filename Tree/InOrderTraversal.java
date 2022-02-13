package DS.Tree;
import DS.Tree.Tree.TreeNode;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        if(root == null)
            return inOrder;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;

        while(true){
            if(treeNode != null){
                stack.push(treeNode);
                treeNode = treeNode.left;
            }else{
                if(stack.isEmpty())
                    break;

                treeNode = stack.pop();
                inOrder.add(treeNode.data);
                treeNode = treeNode.right;
            }
        }
        return inOrder;
    }
}
