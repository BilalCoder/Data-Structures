package BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree.isEmpty());
        tree.insert(7);
        System.out.println(tree.isEmpty());
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(10));
        System.out.println(tree.find(101));
        System.out.println(tree.find(1));
        System.out.println(tree.find(2));
        tree.traversePreOrder();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traversePostOrder();
        System.out.println();
    }
}
