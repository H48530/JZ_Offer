package jz35;

/**
 *
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class 复杂链表的复制 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            node.next = cur.next;
            cur.next = node;
            cur = cur.next.next;
        }
        //设置random
        Node pre = head;
        while (pre != null) {
            if (pre.random == null) {
                pre.next.random = null;
            } else {
                pre.next.random= pre.random.next;
            }
            pre = pre.next.next;
        }
        //拆开
        cur = head;
        Node newHead = head.next;
        pre = newHead;
        while (cur != null) {
            cur.next = cur.next.next;
            if (pre.next != null) {
                pre.next = pre.next.next;
                pre = pre.next;
            }
            cur = cur.next;
        }
        return newHead;
    }
}
