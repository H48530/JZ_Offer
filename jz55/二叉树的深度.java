package jz55;

/**
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l, r) + 1;
    }
}
