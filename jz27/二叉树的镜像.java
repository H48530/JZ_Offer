package jz27;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode cur = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(cur);
        return root;
    }
}



