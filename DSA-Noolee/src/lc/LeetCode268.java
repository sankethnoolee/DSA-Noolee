package lc;

public class LeetCode268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        if(nums.length==1){
            if(nums[0]==1){
                return 0;
            }
        }
        for(int i = 0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n = nums.length;
        return ((n*(n+1)/2))-sum;
    }
}
