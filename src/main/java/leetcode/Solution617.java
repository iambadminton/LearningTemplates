package leetcode;


import SharpenSkills.rank5.SimpleCalculator.Tree;

public class Solution617 {
    public static void main(String[] args) {
        Solution617 solution = new Solution617();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.left.left = new TreeNode(5);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree1.left.right = new TreeNode(4);
        tree2.right = new TreeNode(3);
        tree2.right.right = new TreeNode(7);

        //TreeNode newTree = solution.mergeTrees(tree1, tree2);
        TreeNode newTree = solution.mergeNode(tree1, tree2);

        System.out.println("111");


    }

    

    private TreeNode mergeNode(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return null;
        }
        if(root1 == null) {
            root1 = new TreeNode(0);
        }
        if(root2 == null) {
            root2 = new TreeNode(0);
        }

        int val1 = root1.val;
        int val2 = root2.val;

        TreeNode treeNode = new TreeNode((val1 + val2));
        if (root1.left == null && root1.right == null &&
                root2.left == null && root2.right == null) {
            return treeNode;
        } else if (root1.left == null && root2.left == null) {
            TreeNode right = mergeNode(root1.right, root2.right);
            treeNode.right = right;
            return treeNode;
        } else if (root1.right == null && root2.right == null) {
            TreeNode left = mergeNode(root1.left, root2.left);
            treeNode.left = left;
            return treeNode;
        } else {
            TreeNode left = mergeNode(root1.left, root2.left);
            TreeNode right = mergeNode(root1.right, root2.right);
            treeNode.left = left;
            treeNode.right = right;
            return treeNode;
        }

    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}