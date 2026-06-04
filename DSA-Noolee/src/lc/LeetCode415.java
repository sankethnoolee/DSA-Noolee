package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode415 {

    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int[] nums = {};
        // Loop until both strings are fully processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        // The digits were appended from right to left, so the result must be reversed
        return ans.reverse().toString();
    }
}
