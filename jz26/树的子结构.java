package jz26;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return find(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean find(TreeNode A, TreeNode B) {
        if (B == null)
            return false;
        if (A == null)
            return false;
        return A.val == B.val && find(A.left, B.left) && find(A.right, B.right);
    }
}
