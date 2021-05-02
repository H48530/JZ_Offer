package jz29;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class 顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
        int col = matrix[0].length;
        int start = 0;
        List<Integer> list = new ArrayList<>();
        while (col > start * 2 && row > start * 2) {

            list.addAll(Print(matrix, row, col, start));
            start++;
        }
        int[] arr = new int[col * row];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private List<Integer> Print(int[][] matrix, int row, int col, int start) {
        int endx = col - 1 - start;
        int endy = row - 1 - start;
        List<Integer> list = new ArrayList<>();
        //从左到右打印
        for (int i = start; i <= endx; i++) {
            int number = matrix[start][i];
            list.add(number);
        }
        //从上到下
        if (start < endy) {
            for (int i = start + 1; i <= endy; i++) {
                int number = matrix[i][endx];
                list.add(number);
            }
        }
        //从右到左
        if (start < endx && start < endy) {
            for (int i = endx - 1; i >= start; i--) {
                int number = matrix[endy][i];
                list.add(number);
            }
        }
        //从下到上
        if (start < endx && start < endy - 1) {
            for (int i = endy - 1; i >= start + 1; i--) {
                int number = matrix[i][start];
                list.add(number);
            }
        }
        return list;
    }
}
