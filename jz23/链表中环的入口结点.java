package jz23;

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

public class 链表中环的入口结点 {
    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                return null;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == slow) {
            slow = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        } else {
            return null;
        }
    }
}
