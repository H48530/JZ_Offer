package jz11;

/**
 *
 */
public class 旋转数组中最小的数字 {

    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int m = 0;
        int n = numbers.length - 1;
        int mid = m;
        while (numbers[m] >= numbers[n]) {
            if (n - m == 1) {
                mid = n;
                break;
            }
            mid = (m + n) / 2;
            if (numbers[m] == numbers[n] && numbers[mid] == numbers[m]) {
                return minInorder(numbers, m, n);
            }

            if (numbers[mid] >= numbers[m]) {
                m = mid;
            } else if (numbers[mid] <= numbers[n]) {
                n = mid;
            }
        }
        return numbers[mid];
    }

    private int minInorder(int[] numbers, int m, int n) {
        int ret = numbers[m];
        for (int i = m + 1; i <= n; i++) {
            if (ret > numbers[i]) {
                return numbers[i];
            }
        }
        return ret;
    }

}
