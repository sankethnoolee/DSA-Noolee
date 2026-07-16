package lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);
            if (!seen.add(sub)) {
                duplicates.add(sub);
            }
        }

        return new ArrayList<>(duplicates);
    }
}
