package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode809 {
    public int expressiveWords(String s, String[] words) {
        // Step 1: Compress the target string s into characters and their consecutive counts
        List<Character> sChars = new ArrayList<>();
        List<Integer> sCounts = new ArrayList<>();
        compress(s, sChars, sCounts);

        int count = 0;

        // Step 2: Process each word in the list
        for (String st : words) {
            List<Character> wChars = new ArrayList<>();
            List<Integer> wCounts = new ArrayList<>();
            compress(st, wChars, wCounts);

            // Step 3: Compare sizes of compressed lists
            if (sChars.size() != wChars.size()) {
                continue;
            }

            boolean stretch = true;
            // Step 4: Run your condition checks on consecutive blocks
            for (int i = 0; i < sChars.size(); i++) {
                // Characters must match in order
                if (sChars.get(i) != wChars.get(i)) {
                    stretch = false;
                    break;
                }

                int sCount = sCounts.get(i);
                int wCount = wCounts.get(i);

                // Modified versions of your original logic constraints:
                if (sCount < wCount) { // target cannot have fewer characters than word group
                    stretch = false;
                    break;
                }
                if (sCount != wCount && sCount < 3) { // Extension requires a final size of 3+
                    stretch = false;
                    break;
                }
            }

            if (stretch) {
                count++;
            }
        }
        return count;
    }

    // Helper method to extract run-length encoding
    private void compress(String str, List<Character> chars, List<Integer> counts) {
        int n = str.length();
        int i = 0;
        while (i < n) {
            char c = str.charAt(i);
            int count = 0;
            while (i < n && str.charAt(i) == c) {
                count++;
                i++;
            }
            chars.add(c);
            counts.add(count);
        }
    }
}
