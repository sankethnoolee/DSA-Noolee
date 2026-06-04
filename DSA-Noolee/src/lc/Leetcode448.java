package lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> res = new HashSet<>();
        List<Integer> f = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            res.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            if(!res.contains(i+1)){
                f.add(i+1);
            }
        }
        return f;
    }
}
