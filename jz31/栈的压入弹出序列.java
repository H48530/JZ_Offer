package jz31;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 */

public class 栈的压入弹出序列 {
    private List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        List<Integer> pushedList = toList(pushed);
        List<Integer> poppedList = toList(popped);
        Stack<Integer> stack = new Stack<>();

        for (int e : poppedList) {
            if (!stack.isEmpty() && stack.peek() == e) {
                stack.pop();
                continue;
            }
            while (true) {
                if (pushedList.isEmpty()) {
                    return false;
                }
                int f = pushedList.remove(0);
                if (f == e) {
                    break;
                }
                stack.push(f);
            }

        }
        return stack.isEmpty();
    }
}
