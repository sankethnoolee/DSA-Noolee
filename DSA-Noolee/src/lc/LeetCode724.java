package lc;

public class LeetCode724 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum is totalSum minus leftSum minus the current element
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Update left sum for the next iteration
            leftSum += nums[i];
        }

        // Return -1 if no pivot index is found
        return -1;
    }
}
