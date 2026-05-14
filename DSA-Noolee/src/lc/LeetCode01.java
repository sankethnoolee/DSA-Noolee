package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode01 {
    public int[] twoSum(int[] nums, int target) {
        //This approach is using maps
        Map<Integer, Integer> numInd = new HashMap<>();
        for(int i = 0;i<nums.length ; i++){
            Integer remainder = target - nums[i];
            if(numInd.containsKey(remainder)){
                return new int[]{numInd.get(remainder),i};
            }
            numInd.put(nums[i],i);
        }
        return new int[]{-1,-1};



        /*
        //Brute force
        int [] res= new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++){
                if(i==j){//ignore same index
                     continue;}
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
        */
        /*
        #This doesnt work since after sorting we'll lose original index
        Arrays.sort(nums);
        int s = 0;
        int l = nums.length-1;
        int[] res = {s,l};
        while(s<l){
            if(nums[s]+nums[l]==target){
                return res;
            }else if(target<(nums[s]+nums[l])){
                l--;
                res[1]=l;
            } else if (target>(nums[s]+nums[l])) {
                s++;
                res[0]=s;
            }
        }
        return res;
        */
    }
}
