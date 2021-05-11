package jz56;

/**
 *
 */
public class 数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int l = 1;
        while ((l & ret) != 0) {
            l <<= 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((l & num) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
