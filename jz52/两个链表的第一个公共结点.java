package jz52;


import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class 两个链表的第一个公共结点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int conut1 = getListLength(headA);
        int conut2 = getListLength(headB);
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int k = conut1 - conut2;
        if (k >= 0) {
            for (int i = 0; i < k; i++) {
                cur1 = cur1.next;
            }
        } else {
            for (int i = 0; i < -k; i++) {
                cur2 = cur2.next;
            }
        }
        while (cur1 != null && cur2 != null) {
            if (cur1.equals(cur2)) {
                return cur1;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }

    private int getListLength(ListNode headA) {
        int count = 0;
        ListNode cur = headA;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
