package lc;

import java.util.*;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        for(int i = 0; i<len-2;i++){
            int j = i+1;
            int k = len-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    s.add(l);
                    j++;
                    k--;
                } else if (sum>0) {
                    k--;
                } else if (sum<0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(new ArrayList<>(s));
    }
}
