package lc;

public class LeetCode75 {
    public void sortColors(int[] nums) {
        int [] c = new int[3];
        int l =nums.length;
        for(int i = 0;i<l;i++){
            c[nums[i]]++;
        }
        for(int i = 0;i<l;i++){
            if(c[0]!=0){
                nums[i]=0;
                c[0]--;
            }else if(c[1]!=0){
                nums[i]=1;
                c[1]--;
            }else if(c[2]!=0){
                nums[i]=2;
                c[2]--;
            }
        }
    }
}
