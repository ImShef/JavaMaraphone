package day10;

public class BinarySearchTree {
    public Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value){
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current) {
        if (current == null) return;

        printInOrderRecursive(current.left);
        System.out.println(current.value + " ");
        printInOrderRecursive(current.right);
    }
}
