package lc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode41 {
    public static void main(String[] args) {
        LeetCode41 lc = new LeetCode41();
        lc.firstMissingPositive(new int[]{7,1,9,11,12});
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            while (nums[i] >= 1 &&
                    nums[i] <= n &&
                    nums[i] != nums[nums[i] - 1]) {

                int correct = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        /* BRUTE FORCE
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <=0) {
                nums[i] = Integer.MAX_VALUE;
            }
            if(!set.add(nums[i])){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);*/
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
