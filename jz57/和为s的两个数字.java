package jz57;

/**
 *
 */
public class 和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{nums[left], nums[right]};
    }
}
