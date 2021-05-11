package jz56;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class 数组中唯一只出现一次的数字 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int size = map.getOrDefault(num, 0);
            map.put(num, size + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
