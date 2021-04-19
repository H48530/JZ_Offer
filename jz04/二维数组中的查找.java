package jz04;

/**
 *其实站在右上角看，这个二维数组像一个二叉搜索树。
 */
public class 二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        boolean flag = false;
        if (row > 0 && col > 0) {
            int r = 0;
            int c = col - 1;
            while (r < row && c >= 0) {
                if (matrix[r][c] == target) {
                    flag = true;
                    break;
                } else if (matrix[r][c] > target) {
                    c--;
                } else {
                    r++;
                }
            }
        }
        return flag;
    }
}
