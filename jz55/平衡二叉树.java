package jz55;

/**
 *
 */

public class 平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = recur(root.left);
        if(left == -1) {
            return -1;
        }
        int right = recur(root.right);
        if(right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }


    public boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        int ret = l - r;
        if (ret > 1 || ret < -1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = depth(root.left);
        int r = depth(root.right);

        return Math.max(l, r) + 1;
    }
}
