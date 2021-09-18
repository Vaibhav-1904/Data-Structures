package DS.Tree;

import java.util.Scanner;

public class Tree {
    static Scanner scan = new Scanner(System.in);
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node createTree(){
        Node root = null;
        System.out.println("Enter Data : ");
        int data = scan.nextInt();

        if(data == -1)
            return null;

        root = new Node(data);
        System.out.println("Enter data for left Node of Node " + data);
        root.left = createTree();

        System.out.println("Enter data for right Node of Node : " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        Node root = createTree();

        while(root != null)
        {
            System.out.println(root.data);
            root = root.left;
        }
    }
}
