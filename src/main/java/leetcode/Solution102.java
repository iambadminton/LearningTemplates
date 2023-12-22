package leetcode;

import SharpenSkills.rank5.SimpleCalculator.Tree;

import java.util.*;

public class Solution102 {
    List<Integer> list;
    List<List<Integer>> order = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution102 solution = new Solution102();
        //System.out.println(solution.levelOrder(root));
        System.out.println(solution.levelOrder(root));

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        helper(root, 0);
        return order;
    }

    private void helper(TreeNode node, int level) {
        if(order.size() == level) {
            List<Integer> list = new ArrayList<>();
            order.add(list);
        }
        order.get(level).add(node.val);

        if(node.left != null) {
            helper(node.left, level + 1);
        }

        if(node.right != null) {
            helper(node.right, level + 1);
        }
    }



    public List<List<Integer>> BFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(node.val);
            result.add(currentLevel);
        }
        return result;

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
    }
}
