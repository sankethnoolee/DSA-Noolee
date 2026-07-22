package lc;

public class LeetCode303 {
    int [] nums;
    public LeetCode303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int r = 0;
        for(int i = left;i<=right;i++){
            r = r + nums[i];
        }
        return r;
    }
}
