package DS.Tree.BST;

public class BSTNode {
    static class Node{
        Node left, right;
        int data;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    // Optimal Insert function is using Morris Traversal
    static Node insert(Node root, int val){
        if(root == null) // Base Condition
            return new Node(val);

        if(val < root.data)
            root.left  = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    // Inorder of BST is in Ascending order
    static void inOrder(Node root) {
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static int height(Node root) {
        if(root == null)
            return 0;

        return 1 + height(root.left) + height(root.right);
    }

    // T -> O(n^2), Optimal Method in ImportantQ
    static boolean isBalanced(Node root) {
        if(root == null)
            return true;

        if(!isBalanced(root.left))
            return false;
        if(!isBalanced(root.right))
            return false;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.abs(lh - rh) <= 1;
    }

    public static void main(String[] args) {
        Node root = new Node(60);
        root = insert(root, 50);
        root = insert(root, 55);
        root = insert(root, 100);
        root = insert(root, 40);
        root = insert(root, 120);

//        inOrder(root);

        System.out.println(isBalanced(root));
    }
}
