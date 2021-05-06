package jz40;

import java.util.*;

/**
 * topK问题
 */
public class 最小的k个数 {
    //堆

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k ==0){
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < queue.peek()) {
                queue.remove();
                queue.add(arr[i]);
            }
        }
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = queue.remove();
        }
        return array;
    }

    //排序
    public int[] getLeastNumbers1(int[] arr, int k) {
        Arrays.sort(arr);
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = arr[i];
        }
        return array;
    }
}
