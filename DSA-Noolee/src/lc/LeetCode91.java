package lc;

public class LeetCode91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int twoBack = 1; // Represents dp[i-2]
        int oneBack = 1; // Represents dp[i-1]

        for (int i = 1; i < n; i++) {
            int current = 0;
            char current_char = s.charAt(i);
            char prev_char = s.charAt(i - 1);

            // Check if single digit valid mapping (1-9) exists
            if (current_char != '0') {
                current += oneBack;
            }

            // Check if two digit valid mapping (10-26) exists
            int twoDigit = (prev_char - '0') * 10 + (current_char - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += twoBack;
            }

            // Update pointers for the next iteration
            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }
}
