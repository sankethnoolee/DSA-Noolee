package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    //Solution could use hashmap as well.
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uni = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(uni.contains(nums[i])){
                return true;
            }
            uni.add(nums[i]);
        }
        return false;
    }
}
