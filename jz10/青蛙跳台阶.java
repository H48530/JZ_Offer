package jz10;

/**
 *其实就是一个变相的斐波那契问题
 */
public class 青蛙跳台阶 {

    public int numWays(int n) {
        if (n < 2) {
            return n;
        }
        return numWays(n - 1) + numWays(n - 2);
    }
}
