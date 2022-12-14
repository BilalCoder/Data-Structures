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

    public int height() {
        return height(root);
    }
    public int height(Node root) {
        if(root == null)
            return -1;
        if(isEmpty())
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean isLeaf(Node node) {
        return root.left == null && root.right == null;
    }

    //need to traverse all nodes (for normal trees) O(n)
    public int minValueInNormalBinaryTree() {
        return minValueInNormalBinaryTree(root);
    }
    private int minValueInNormalBinaryTree(Node root) {
        if(isLeaf(root))
            return root.value;
        int left = minValueInNormalBinaryTree(root.left);
        int right = minValueInNormalBinaryTree(root.right);
        return Math.min(Math.min(left, right), root.value);
    }

    //Need to traverse to leftmost node of tree and takes O(log n) in case of BST
    public int minValueInBST() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value && equals(first.left, second.left) && equals(first.right, second.right);
        return false;
    }

    public void printNodesAtDistance(int distance) {
        printNodesAtDistance(root, distance);
    }
    private void printNodesAtDistance(Node root, int distance) {
       if(root == null)
           return;
       if(distance == 0) {
           System.out.println(root.value);
           return;
       }
       printNodesAtDistance(root.left, distance-1);
       printNodesAtDistance(root.right, distance-1);
    }

    //This is the loop solution. FOr recursive solution using the loop, refer mycodeschool
    public void levelOrderTraversal() {
        for(int i=0; i<=height(); i++) {
            System.out.println("Nodes at level " + i);
            printNodesAtDistance(i);
        }
    }
}
