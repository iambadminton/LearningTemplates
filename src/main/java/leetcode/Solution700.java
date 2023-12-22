
package leetcode;

public class Solution700 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);


        /*TreeNode root = new TreeNode(18);
        root.left = new TreeNode(2);
        root.right = new TreeNode(22);

        root.right.right = new TreeNode(63);
        root.right = new TreeNode(7);*/

        Solution700 solution = new Solution700();
        System.out.println(solution.searchBST(root, 2));

    }

    public TreeNode searchBST(TreeNode root, int val) {

        if (root.val == val)
            return root;
        if (root.val > val && root.left != null)
            return searchBST(root.left, val);
        if (root.val <= val && root.right != null)
            return searchBST(root.right, val);
        return null;
    }


    static public class TreeNode {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left -> " + left +
                    ", right ->" + right +
                    '}';
        }
    }
}
