package lc;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = first(nums,target);
        res[1] = last(nums,target);
        return res;
    }
    public int first(int[] nums, int target){
        int ind = -1;
        int l = 0;
        int h = nums.length-1;
        while(l<=h){
            int m = l + ((h-l)/2);
            if(nums[m]>=target){
                h = m-1;
            }else{
                l = m +1;
            }
            if(nums[m]==target){
                ind = m; //potential nut continue until u find lowest
            }
        }
        return ind;
    }

    public int last(int[] nums, int target){
        int ind = -1;
        int l = 0;
        int h = nums.length-1;
        while(l<=h){
            int m = l + ((h-l)/2);
            if(nums[m]<=target){
                l = m+1;
            }else{
                h = m -1;
            }
            if(nums[m]==target){
                ind = m; //potential nut continue until u find highest
            }
        }
        return ind;
    }
}
