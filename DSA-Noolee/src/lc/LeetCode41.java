package lc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <=0) {
                nums[i] = Integer.MAX_VALUE;
            }
            if(!set.add(nums[i])){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
