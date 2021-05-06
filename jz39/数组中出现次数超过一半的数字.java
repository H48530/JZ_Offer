package jz39;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class 数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        int m = 0;
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int y = entry.getValue();
            if (y > n) {
                m = x;
            }
        }
        return m;
    }

    public int majorityElement1(int[] nums) {
        //排序，中位数
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
