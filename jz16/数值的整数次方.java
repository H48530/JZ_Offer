package jz16;

/**
 *
 */
public class 数值的整数次方 {
    //递归：
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double ret = myPow(x, n >> 1);
        ret *= ret;
        if ((n & 0x1) == 1) {
            ret *= x;
        }
        return ret;

    }

    //循环
    public double myPow1(double x, int n) {
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1;
        while (b != 0) {
            if (b % 2 != 0) {
                res *= x;
            }
            b >>= 1;
            x *= x;
        }
        return res;
    }
}
