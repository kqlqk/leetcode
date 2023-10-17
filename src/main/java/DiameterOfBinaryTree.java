package main.java;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, null, null));

        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(node));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root,diameter);

        return diameter[0];
    }

    public int height(TreeNode root, int[] diameter){
        if(root == null){
            return 0;
        }

        int left = height(root.left,diameter);
        int right = height(root.right,diameter);

        diameter[0] = Math.max(diameter[0],left + right);

        return Math.max(left,right)+1;
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
