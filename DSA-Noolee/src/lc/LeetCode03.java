package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode03 {
    public static void main(String[] args) {
        double a = 0.2;
        double b = 0.1;
        System.out.println(a+b);
        System.out.println(a+b==0.3);
    }

    public int lengthOfLongestSubstring(String s) {
        char[] cArr = s.toCharArray();
        int max = 0;
        int sub = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<cArr.length;i++){
            if(!set.add(cArr[i])){
                set=new HashSet<>();
                set.add(cArr[i]);
                max = Math.max(max,sub);
                sub=1;

            }else{
                sub++;
                max = Math.max(max,sub);
            }
        }
        return max;
    }
}
