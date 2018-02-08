package AlgorithmsAndStructures.BinaryTreePackage;

/**
 * Created by a.shipulin on 08.02.18.
 * по образцу и подобию с
 * https://stackoverflow.com/questions/47997937/how-to-print-a-binary-tree
 */
public class BinaryTree {
    int key;
    public BinaryTree left;
    public BinaryTree right;
    public static int AMOUNT_INDENT = 3;


    public BinaryTree(int key) {

        this.key = key;
        this.left = null;
        this.right = null;
    }

    public void add(BinaryTree tree) {
        if (tree.key > key) {
            if (right != null) {
                right.add(tree);
            } else {
                right = tree;

            }
        } else {
            if (left != null) {
                left.add(tree);
            } else {
                left = tree;
            }
        }

    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void newLine(StringBuilder builder) {
        builder.append(System.lineSeparator());
    }

    public void indent(StringBuilder builder, int indent) {
        builder.append(Helper.repeat(indent + (AMOUNT_INDENT + 1), " "));
    }

    public String toString(int indent) {
        /*System.out.println("toString(" + indent + ")");*/
        StringBuilder builder = new StringBuilder();
        builder.append(key);
        newLine(builder);
        if (left != null) {
            System.out.println("cur" + this.key + " left:" + left.key);
            indent(builder, indent);
            builder.append(("└" + Helper.repeat(AMOUNT_INDENT, "-") + left.toString(indent + 1)));
        }
        if (right != null) {
            System.out.println("cur" + this.key + " right:" + right.key);
            indent(builder, indent);
            builder.append(("└" + Helper.repeat(AMOUNT_INDENT, "-") + right.toString(indent + 1)));
        }
        return builder.toString();


    }

    @Override
    public String toString() {
        /*System.out.println("@override toString");*/
        return toString(0);
    }


}
