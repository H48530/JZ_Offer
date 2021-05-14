package jz61;

import java.util.Arrays;

/**
 *
 */
public class 扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        int ret = 0;
        int small = count;
        int big = count + 1;
        while (big < nums.length) {
            if (nums[small] == nums[big]) {
                return false;
            }
            ret += nums[big] - nums[small] - 1;
            small = big;
            big++;
        }
        return ret > count;

    }
}
