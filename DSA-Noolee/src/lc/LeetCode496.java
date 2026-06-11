package lc;

public class LeetCode496 {
    public static void main(String[] args) {
        LeetCode496 lc= new LeetCode496();
        lc.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] res = new int[nums1.length];
        for(int i = 0;i< nums1.length;i++){
            int index = -1;
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            res[i]= -1;
            for(int j = index+1; j< nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    break;
                }
                res[i]=-1;
            }

        }
        return res;
    }
}
