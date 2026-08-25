package lc;

import java.util.HashSet;

public class LeetCode3718 {
    public int missingMultiple(int[] nums, int k) {
        // Step 1: Store all elements of nums in a HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Iterate through multiples of k starting from 1 * k
        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }

        // Step 3: Return the first multiple that is not present in the set
        return multiple;
    }
}
