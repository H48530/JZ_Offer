package jz05;

import java.util.Arrays;

/**
 *
 */
public class 替换空格 {
    //从后向前
    public static String replaceSpace1(String s) {
        char[] array = s.toCharArray();
        int count = 0;
        for (char c : array) {
            if (c == ' ') {
                count++;
            }
        }
        int size = array.length + 2 * count - 1;
        char[] newArray = new char[size + 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ' ') {
                newArray[size--] = '0';
                newArray[size--] = '2';
                newArray[size--] = '%';
            }else {
                newArray[size--] = array[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : newArray) {
            sb.append(c);
        }
        return sb.toString();
    }

    //直接遍历元素法+开空间
    public String replaceSpace(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
