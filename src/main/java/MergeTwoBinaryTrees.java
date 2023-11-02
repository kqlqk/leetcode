package main.java;

import java.util.Arrays;
import java.util.Stack;

public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(3, new TreeNode(5, null, null), null),
                new TreeNode(2, null, null));

        TreeNode root2 = new TreeNode(2,
                new TreeNode(1, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, new TreeNode(7, null, null)));

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);

        return merged;
    }


    public static class TreeNode {
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
