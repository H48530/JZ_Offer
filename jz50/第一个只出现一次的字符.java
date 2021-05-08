package jz50;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class 第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            int num = map.getOrDefault(temp,0);
            num++;
            map.put(temp,num);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return ' ';
    }
    public char firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            //首次出现的位置是当前位置，且后面没有再出现这个字符
            if(s.indexOf(ch)==i&&s.indexOf(ch,i+1)==-1)
                return s.charAt(i);
        }
        return ' ';
    }
}
