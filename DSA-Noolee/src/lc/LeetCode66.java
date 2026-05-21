package lc;

import java.math.BigInteger;
import java.util.Arrays;

public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i< digits.length;i++){
            sb.append(digits[i]);
        }

        String temp = addLargeNumbers(sb.toString(),"1");
        int[] res = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {

            res[i] = temp.charAt(i) - '0';
        }
        return res;
    }
    public static String addLargeNumbers(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;

        // Loop from right to left
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += str1.charAt(i--) - '0'; // Convert char to int
            if (j >= 0) sum += str2.charAt(j--) - '0'; // Convert char to int

            carry = sum / 10;          // Calculate new carry
            result.append(sum % 10);   // Append current digit
        }

        // Reverse the result since we added from right to left
        return result.reverse().toString();
    }
}
