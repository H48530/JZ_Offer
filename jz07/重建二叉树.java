package jz07;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * 无法通过单一的前序、中序、后序 建立二叉树
 * 因为不能建立唯一确定的二叉树
 * <p>
 * 根据前中序重建二叉树
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int intVal = preorder[0];
        TreeNode root = new TreeNode(intVal);
        int i = 0;
        for (; i < inorder.length; i++) {
            if (inorder[i] == intVal) {
                break;
            }
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, i + 1);
        int[] leftinorder = Arrays.copyOfRange(inorder, 0, i);
        root.left = buildTree(leftPreorder, leftinorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, i + 1, preorder.length);
        int[] rightinorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightinorder);
        return root;
    }


    //同理根据后+中重建二叉树
    public TreeNode buildTree2(int[] nextorder, int[] inorder) {
        if (nextorder.length == 0) {
            return null;
        }
        int v = nextorder[nextorder.length - 1];

        TreeNode root = new TreeNode(v);
        int i = 0;
        for (; i < inorder.length; i++) {
            if (inorder[i] == v) {
                break;
            }
        }
        int[] leftnext = Arrays.copyOfRange(nextorder, 0, i);
        int[] leftin = Arrays.copyOfRange(inorder, 0, i);

        root.left = buildTree2(leftnext, leftin);

        int[] rightnext = Arrays.copyOfRange(nextorder, i, nextorder.length - 1);
        int[] rightin = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        root.right = buildTree2(rightnext, rightin);
        return root;
    }
}
