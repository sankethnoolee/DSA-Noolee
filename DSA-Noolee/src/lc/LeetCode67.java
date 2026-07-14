package lc;

public class LeetCode67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop from right to left through both strings
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add bit from string 'a' if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add bit from string 'b' if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the remainder (0 or 1) to our result
            result.append(sum % 2);

            // Calculate the new carry (0 or 1)
            carry = sum / 2;
        }

        // The bits were added right-to-left, so reverse to get correct order
        return result.reverse().toString();
    }
}
