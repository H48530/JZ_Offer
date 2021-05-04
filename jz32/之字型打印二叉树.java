package jz32;

import java.util.*;

/**
 *
 */
public class 之字型打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(0);
        }
        List<List<Integer>> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        int c = 0;
        while (!stack1.empty() || !stack2.empty()) {
            List<Integer> temp_res = new LinkedList<>();
            if (stack2.empty()) { //B为空，说明结点都在A栈中
                int len = stack1.size();
                for (int i = 0; i < len; i++) {
                    TreeNode temp = stack1.pop();
                    temp_res.add(temp.val);
                    if (temp.left != null) stack2.push(temp.left);
                    if (temp.right != null) stack2.push(temp.right);
                }
            } else {
                int len = stack2.size();
                for (int i = 0; i < len; i++) {
                    TreeNode temp = stack2.pop();
                    temp_res.add(temp.val);
                    if (temp.right != null) stack1.push(temp.right);
                    if (temp.left != null) stack1.push(temp.left);
                }
            }
            list.add(temp_res);
            c++;
        }
        return list;
    }
}



