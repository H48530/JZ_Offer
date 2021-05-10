package jz54;

import java.util.ArrayList;

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


public class 二叉搜索树的第k大结点 {
    public int kthLargest(TreeNode root, int k) {
        inOrder(root);
        if (list.size() == 0 ){
            return -1;
        }
        return list.get(list.size()-k);
    }

    ArrayList<Integer> list = new ArrayList<>();
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
