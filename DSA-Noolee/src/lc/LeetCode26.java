package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> u = new HashSet<>();
        int [] res = new int[nums.length];
        int k = 0;
        for(int i = 0; i<nums.length;i++){
            if(u.add(nums[i])){
                res[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i<k;i++){
            nums[i]=res[i] ;
        }
        return k;
    }
}
