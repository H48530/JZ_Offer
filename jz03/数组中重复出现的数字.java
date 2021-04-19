package jz03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class 数组中重复出现的数字 {
    //1.排序，相邻比较
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    //2、利用hashset去重
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return num;
            }
        }
        return -1;
    }

    //3.
    public int findRepeatNumber3(int[] nums) {
        for (int num : nums) {
            if (num < 0 || num > nums.length - 1) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int a = nums[i];
                int tmp = nums[i];
                nums[i] = nums[a];
                nums[a] = tmp;
            }

        }
        return -1;
    }

    //不修改数组找出重复数字

    public int findRepeatNumber4(int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }
        int start = 1;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = ((end - start) >> 1) + start;
            int count = countRange(nums, nums.length, start, mid);
            if (end == start) {
                if (count > 1)
                    return start;
                else
                    break;
            }
            if (count > (mid - start + 1))
                end = mid;
            else
                start = mid + 1;
        }
        return -1;
    }

    private int countRange(int[] nums, int length, int start, int end) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= start && nums[i] <= end)
                count++;
        }
        return count;
    }

}
