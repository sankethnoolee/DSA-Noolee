package lc;

public class LeetCode409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int ans = 0;
        boolean hasOdd = false;

        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1) {
                hasOdd = true;
            }
        }

        return hasOdd ? ans + 1 : ans;
    }
}
