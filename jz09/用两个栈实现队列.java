package jz09;

import java.util.Stack;

/**
 *
 */
class CQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {
    }

    public void appendTail(int value) {
        stack2.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                int pop = stack2.pop();
                stack1.push(pop);
            }
        }
        return stack1.isEmpty() ? -1 : stack1.pop();
    }
}

public class 用两个栈实现队列 {
}
