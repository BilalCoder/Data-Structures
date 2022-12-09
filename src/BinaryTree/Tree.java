package BinaryTree;

public class Tree {
    private Node root;
    private class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(isEmpty()) {
            root = node;
            return;
        }
        else {
            Node current = root;
            while(true) {
                if(value > current.value) {
                    if (current.right == null) {
                        current.right = node;
                        break;
                    }
                    current = current.right;
                }
                else {
                    if (current.left == null) {
                        current.left = node;
                        break;
                    }
                    current = current.left;
                }
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while(current != null) {
            if(value < current.value)
                current = current.left;
            else if (value > current.value)
                current = current.right;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.left);
        System.out.print(root.value + " ");
        traverseInOrder(root.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.value + " ");
    }

    public boolean isEmpty() {
        return root == null;
    }
}
