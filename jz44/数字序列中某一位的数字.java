package jz44;

/**
 *
 */
public class 数字序列中某一位的数字 {
    public int findNthDigit(int n) {
        int digit = 1;   // n所在数字的位数
        long start = 1;  // 数字范围开始的第一个数
        long count = 9;  // 占多少位
        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}


//    public int findNthDigit(int n) {
//        if (n < 0) {
//            return -1;
//        }
//        int target = 1;
//        while (true) {
//            int number = countOfIntegers(target);
//            if (n < number * target) {
//                return digitAtIndex(n, target);
//            }
//            n -= target * number;
//            target++;
//        }
//    }
//
//    private int digitAtIndex(int n, int target) {
//        int number = beginNumber(target) + n / target;
//        int indexFromRight = target - n % target;
//        for (int i = 1; i < indexFromRight; i++) {
//            number /= 10;
//        }
//        return number % 10;
//    }
//
//    private int beginNumber(int target) {
//        if (target == 1) {
//            return 0;
//        }
//        return (int) Math.pow(10, target - 1);
//    }
//
//    private int countOfIntegers(int target) {
//        if (target == 1) {
//            return 10;
//        }
//        int count = (int) Math.pow(10, target - 1);
//        return 9 * count;
//    }

