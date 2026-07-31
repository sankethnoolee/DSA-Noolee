package lc;

import java.util.HashSet;

public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        //using set
        int[] count = new int[nums.length + 1];
        for (int i : nums) {
            count[i]++;
        }
        int[] res = new int[2];
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2)
                res[0] = i;
            if (count[i] == 0)
                res[1] = i;
        }
        return res;

        //hashset
        /*int[] res= new int[2];
        HashSet<Integer> set = new HashSet<>();
        int total = 0;
        int l = nums.length;
        for(int i : nums){
            if(!set.add(i)){
                res[0] = i;
            }else{
                total+=i;
            }
        }
        int sum  = (l*(l+1))/2;
        res[1] = sum-total;
        return res;*/
    }
}
