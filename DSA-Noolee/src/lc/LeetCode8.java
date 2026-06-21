package lc;

public class LeetCode8 {
    public static void main(String[] args) {
        LeetCode8 lc = new LeetCode8();
        lc.myAtoi("-91283472332");
    }
    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int index = 0;
        int n = s.length();

        // 1. Skip leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Check if string became empty after skipping whitespaces
        if (index == n) {
            return 0;
        }

        // 2. Handle sign specificity
        int sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // 3. Convert digits and guard against overflow
        int total = 0;
        while (index < n) {
            char ch = s.charAt(index);

            // Break at the first non-digit character
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // Check overflow before modifying total
            if (total > Integer.MAX_VALUE / 10 ||
                    (total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;


    }
}
