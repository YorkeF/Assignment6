//Write a Java program to implement a given binary search tree and print all the leaves of
//the tree that you implemented. [10, 7, 14, 20, 1, 5, 8]
public class Ferrell_Problem3 {
    public static void main(String[] args) {
        //Declares a Binary Search Tree and adds each node.
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10); tree.add(7); tree.add(14);
        tree.add(20); tree.add(1);
        tree.add(5); tree.add(8);
        //calls the print leaves method
        tree.printLeaves();
    }
}

//Defines a Binary Search Tree
class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    public void add(int val) {
        root = add(root, val);
    }
    private Node add(Node node, int val) {
        if (node == null) {
            node = new Node(val);
        } else {
            //Implements the sorting
            if (val < node.val) {
                node.left = add(node.left, val);
            } else if (val > node.val) {
                node.right = add(node.right, val);
            }
        }
        return node;
    }
    //Method to print all leaves
    public void printLeaves() {
        printLeaves(root);
    }
    private void printLeaves(Node node) {
        if (node == null) {
            return;
        }
        //Determines if it is a leaf node, then prints.
        if (node.left == null && node.right == null) {
            System.out.println(node.val);
        } else {
            printLeaves(node.left);
            printLeaves(node.right);
        }
    }
}
//Defines a Node
class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
