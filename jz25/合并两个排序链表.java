package jz25;

import java.util.List;

/**
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class 合并两个排序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val > cur2.val) {
                cur.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            } else {
                cur.next = cur1;
                cur = cur.next;
                cur1 = cur1.next;
            }
        }
        if (cur1 == null) {
            cur.next = cur2;
        } else {
            cur.next = cur1;
        }
        return newHead.next;
    }
}
