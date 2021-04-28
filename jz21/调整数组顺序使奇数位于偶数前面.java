package jz21;

/**
 *
 */
public class 调整数组顺序使奇数位于偶数前面 {

    public int[] exchange(int[] nums) {
        int x = 0;
        int y = nums.length - 1;
        while (x < y) {
            while (x < y && nums[y] % 2 == 0) {
                y--;
            }
            while (x < y && nums[x] % 2 != 0) {
                x++;
            }
            if (x < y) {
                int tmp = nums[x];
                nums[x] = nums[y];
                nums[y] = tmp;
            }
        }
        return nums;
    }
}
