package lc;

public class LeetCode485 {
    //Beats 100%
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1 && nums[0]==0){
            return 0;
        }
        int max = 0;
        int cnt = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                max = Math.max(max,cnt);
                cnt=0;
            }else{
                cnt++;
            }
        }
        max = Math.max(max,cnt);
        return max;
    }
}
