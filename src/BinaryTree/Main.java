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
        System.out.println("Height - " + tree.height());
        System.out.println("Min value in normal Binary tree(general method)- " + tree.minValueInBST());
        //System.out.println("Min value in BST (specific for BST)- " + tree.minValueInNormalBinaryTree());

        Tree tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(10);

        System.out.println("Tree1 equals tree2 - " + tree.equals(tree));

        System.out.println("Nodes at distance 2 from root = ");
        tree1.printNodesAtDistance(2);

        tree1.levelOrderTraversal();
    }
}
