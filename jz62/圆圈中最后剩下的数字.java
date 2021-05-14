package jz62;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 */
public class 圆圈中最后剩下的数字 {

    public static int lastRemaining(int n, int m) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            for (int i = 1; i < m % (n - i + 1); i++) {
                int a = queue.remove();
                queue.add(a);
            }
            queue.remove();
        }

        return queue.remove();
    }

    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(lastRemaining(5, 3));
    }
}
