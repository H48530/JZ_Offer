package jz15;

/**
 *
 */
public class 二进制中1的个数 {
    //n & n-1
    public int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    //方法1：左移
    public int hammingWeight(int n) {
        int count = 0;
        int flg = 1;
        while (flg != 0) {
            if ((n & flg) == 0) {
                count++;
            }
            flg = flg << 1;
        }
        return count;
    }

}
