package lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode859 {
    public boolean buddyStrings(String s, String goal) {
        // Base case: strings must have identical lengths
        if (s.length() != goal.length()) {
            return false;
        }

        // Case 1: Strings are already identical
        if (s.equals(goal)) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                uniqueChars.add(c);
            }
            // True if there is at least one duplicate character to swap
            return uniqueChars.size() < s.length();
        }

        // Case 2: Strings are different, track index mismatches
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndices.add(i);
            }
        }

        // Must have exactly two mismatches
        if (diffIndices.size() != 2) {
            return false;
        }

        // Check if swapping the two mismatched characters matches the goal
        int first = diffIndices.get(0);
        int second = diffIndices.get(1);

        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}
