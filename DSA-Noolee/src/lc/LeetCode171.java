package lc;

public class LeetCode171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            // Get the numeric value of the char (e.g., 'A' = 1, 'B' = 2)
            int charVal = columnTitle.charAt(i) - 'A' + 1;

            // Multiply current result by 26 and add the new character value
            result = result * 26 + charVal;
        }
        return result;
    }
}
