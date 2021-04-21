package jz09;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
//用两个队列实现栈
class MyStack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue2.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        while (!queue2.isEmpty()) {
            int p = queue2.remove();
            queue1.add(p);
        }
        while (!queue1.isEmpty() && queue1.size() > 1) {
            int r = queue1.remove();
            queue2.add(r);
        }
        if (queue1.isEmpty()) {
            return -1;
        } else {
            return queue1.poll();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        int pop = pop();
        push(pop);
        return pop;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue2.size() == 0;
    }
}

//用一个队列实现栈
class MyStack2 {
    Queue<Integer> queue = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack2() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int size = queue.size();
        if (size == 0) {
            return -1;
        }
        while (size > 1) {
            int p = queue.remove();
            queue.add(p);
            size--;
        }
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        int size = queue.size();
        if (size == 0) {
            return -1;
        }
        while (size > 1) {
            int p = queue.remove();
            queue.add(p);
            size--;
        }
        int a = queue.remove();
        queue.add(a);
        return a;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.size() == 0;
    }
}

public class 用队列实现栈 {
}
