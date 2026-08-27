package lc;

import java.util.Arrays;

public class LeetCode561 {
    public int arrayPairSum(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        int maxSum = 0;

        // Step 2: Sum up elements at even positions (0, 2, 4, ...)
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }
}
