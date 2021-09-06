package DS.Tree;
import DS.Tree.Tree.Node;
import java.util.*;

// Also known as Level Order Traversal
public class BFSTraversal {
    // T -> O(n)
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> bfs = new ArrayList<>();
        if(root == null)
            return bfs;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                Node temp = queue.remove();
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
                level.add(temp.data);
            }
            bfs.add(level);
        }
        return bfs;
    }
}
