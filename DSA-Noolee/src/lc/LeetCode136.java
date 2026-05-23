package lc;

import java.util.HashMap;
import java.util.Map;

public class LeetCode136 {
    public int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];
        Map<Integer,Integer> res = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            if(res.containsKey(nums[i])){
                res.put(nums[i],res.get(nums[i])+1);
            }else{
                res.put(nums[i],1);
            }
        }
        for(Integer i : res.keySet()){
            if(res.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}
