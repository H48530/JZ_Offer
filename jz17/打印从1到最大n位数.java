package jz17;

/**
 *
 */
public class 打印从1到最大n位数 {
    public int[] printNumbers(int n) {
        if (n <= 0) {
            return null;
        }
        int sz = (int) Math.pow(10.0, n) - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sz; i++) {
            sb.append(i + ' ');
        }
        String s = sb.toString();
        String[] s1 = s.split(" ");
        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        return arr;
    }


    public int[] printNumbers1(int n) {

        if (n <= 0) {
            return null;
        }
        int[] arr = new int[(int) (Math.pow(10.0, n) - 1)];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
