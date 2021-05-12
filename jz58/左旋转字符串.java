package jz58;

/**
 *
 */
public class 左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        char[] array = s.toCharArray();
        reverse(array, 0, n - 1);
        reverse(array, n, array.length - 1);
        reverse(array, 0, array.length - 1);

        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            sb.append(c);
        }
        return sb.toString();
    }

    private void reverse(char[] array, int from, int to) {
        while (from <= to) {
            char tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
            from++;
            to--;
        }
    }
}
