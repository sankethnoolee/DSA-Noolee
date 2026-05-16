package lc;

import java.util.*;

public class LeetCode128 {
    public static void main(String[] args) {
        LeetCode128 lc = new LeetCode128();
        lc.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
    }
    public int longestConsecutive(int[] nums) {
        //this is brute force
        //try with hashmap n visited style later

        if(nums.length==0){
           return 0;
        }

        //trying with hashset
        //still find it as BRUTE force
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int i = 0; i<nums.length;i++){
            s.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        int res = 0;
        int cur = 0;

        for (int i = 0 ; i<l.size()-1;i++)
            if(l.get(i)-l.get(i+1)==-1){
                cur++;
            }else{
                res= Math.max(res,cur);
                cur=0;
            }
        return Math.max(res,cur);
    }




        /*
        //this doesnt work since there can repeatative  int

        Arrays.sort(nums);
        int res = 0;
        int cur = 0;
        for (int i = 0 ; i<nums.length-1;i++){
            if(nums[i]-nums[i+1]==-1){
                cur++;
            }else{
                res= Math.max(res,cur);
                cur=0
            }
        }
        return res;

         */

}
