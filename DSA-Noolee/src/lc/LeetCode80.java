package lc;

public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        //TODO read 2 pointers
        int l = nums.length;
        if(l<3){
            return l;
        }
        int s=2,f=2;
        while(f<l){
            if(nums[f]!=nums[s-2]){
                nums[s++]=nums[f];
            }
            f++;
        }
        return s;
    }
}
