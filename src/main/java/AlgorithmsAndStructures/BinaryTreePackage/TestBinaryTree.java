package AlgorithmsAndStructures.BinaryTreePackage;

/**
 * Created by a.shipulin on 08.02.18.
 * по образцу и подобию с
 * https://stackoverflow.com/questions/47997937/how-to-print-a-binary-tree
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree;
        tree = new BinaryTree(7);
        tree.add(new BinaryTree(5));
        tree.add(new BinaryTree(9));
        tree.add(new BinaryTree(2));
        tree.add(new BinaryTree(6));
        tree.add(new BinaryTree(12));
        tree.add(new BinaryTree(4));
        tree.add(new BinaryTree(10));
        //tree.toString();
        System.out.println(tree.toString());

    }
}
