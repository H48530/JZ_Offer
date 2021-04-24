package jz10;

/**
 *
 */
public class 斐波那契数列 {
    //递归
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //循环
    public int fib1(int n) {
        if (n < 2) {
            return n;
        }
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (first + second)% (1000000007);
            first = second;
            second = sum;
        }
        return sum;
    }
}
