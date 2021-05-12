package jz58;

/**
 *
 */
public class 翻转单次顺序 {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (!s1[i].equals(" ")){
                sb.append(s1[i]);
            }else {
                continue;
            }
            if (i != 0) {
                sb.append(" ");
            }

        }
        return sb.toString();
    }

}
