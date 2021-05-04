package jz32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class 分行打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(0);
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int s = 1;
        int l = 0;
        while (!queue.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode remove = queue.remove();
                list1.add(remove.val);
                if (remove.left != null) {
                    queue.add(remove.left);
                    l++;
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                    l++;
                }
            }
            s = l;
            l = 0;
            list.add(list1);
        }
        return list;
    }
}
