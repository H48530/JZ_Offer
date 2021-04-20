package jz06;

import java.util.Stack;

/**
 *可以使用栈，先进后出
 * 或者先求出链表长度，建立一个数组，然后数组从后向前放元素；
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class 从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();
        while (cur != null) {
            stack.add(cur.val);
            cur = cur.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
