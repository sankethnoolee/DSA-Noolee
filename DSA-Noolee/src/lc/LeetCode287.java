package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> s  = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(!s.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
