package jz53;

/**
 * 0～n-1中缺失的数字
 */
public class 缺失的数字 {
    public int missingNumber(int[] nums) {
        if (nums[0] == 1) {
            return 0;
        } else if (nums.length == 1 && nums[0] == 0) {
            return 1;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                while (nums[mid] != mid) {
                    mid--;
                }
                break;
            }
        }
        return mid + 1;
    }
}
