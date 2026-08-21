package lc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Convert the list to a HashSet for O(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);

        // dp[i] represents if the substring s[0...i-1] can be segmented
        boolean[] dp = new boolean[s.length() + 1];

        // Base case: an empty string is always valid
        dp[0] = true;

        // Iterate through all possible lengths of the substring
        for (int i = 1; i <= s.length(); i++) {
            // Check all split points before the current index i
            for (int j = 0; j < i; j++) {
                // If s[0...j-1] is valid and s[j...i-1] is in the dictionary, then s[0...i-1] is valid
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // Found a valid segmentation for length i, move to next i
                }
            }
        }

        return dp[s.length()];
    }
}
