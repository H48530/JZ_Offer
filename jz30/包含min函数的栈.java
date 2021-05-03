package jz30;

import java.util.Stack;

/**
 *
 */
class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {
    }

    public void push(int x) {
        if (stack1.isEmpty()) {
            stack1.push(x);
            stack2.push(x);
        } else {
            stack1.push(x);
            int p = stack2.peek();
            if (x < p) {
                stack2.push(x);
            } else {
                stack2.push(p);
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}

public class 包含min函数的栈 {
}
