package lc;

import java.util.ArrayList;

public class LeetCode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp2 = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : nums1){
            temp.add(i);
        }
        for(Integer i : nums2){
            if(temp.contains(i)){
                temp2.add(i);
                temp.remove(i);
            }
        }
        int[] res = new int[temp2.size()];
        int ind = 0;
        for(Integer i : temp2){
            res[ind++]=i;
        }
        return res;
    }
}
