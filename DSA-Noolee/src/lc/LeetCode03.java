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
        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
