package lc;

public class LeetCode643 {
    //sliding window
    public double findMaxAverage(int[] nums, int k) {
        int l = nums.length;
        int sum = 0;
        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }
        int max = sum;
        for(int i = k;i<l;i++){
            sum = sum+nums[i]-nums[i-k];
            max = Math.max(max,sum);
        }
        return (double)max/k;
    }
}
