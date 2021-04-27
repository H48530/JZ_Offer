package jz18;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class 删除链表中的结点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = newHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                break;
            }
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return newHead.next;
    }
}
