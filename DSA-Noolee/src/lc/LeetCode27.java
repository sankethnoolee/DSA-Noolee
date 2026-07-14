package lc;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int [] res = new int[nums.length];
        int k = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=val){
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
