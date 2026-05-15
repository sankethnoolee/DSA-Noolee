package lc;

public class LeetCode238 {
    public static void main(String[] args) {
        LeetCode238 lc = new LeetCode238();
        lc.productExceptSelf(new int[]{1,2,3,4});
    }
    public int[] productExceptSelf(int[] nums) {
        //TODO NEW REVISION TOPIC
        //need to learn presum n implement
        //honestly new concept today but learnt then coded must for revision
        int len = nums.length;
        int [] res = new int[len];

        int[] preSumFromStart = new int[len];
        int[] preSumFromEnd = new int[len];

        preSumFromStart[0] = nums[0];
        for(int i = 1; i<len;i++){
            preSumFromStart[i] = preSumFromStart[i-1]*nums[i];
        }

        preSumFromEnd[len-1] = nums[len-1];
        for(int i = len-2; i>=0;i--){
            preSumFromEnd[i] = preSumFromEnd[i+1]*nums[i];
        }

        res[0] = preSumFromEnd[1];
        res[len-1] = preSumFromStart[len-2];
        for(int i = 1; i<len-1;i++){
            res[i] = preSumFromStart[i-1]*preSumFromEnd[i+1];
        }
        return res;



        /*
        //this brute force timing out
        int len = nums.length;
        int [] res = new int[len];

        for(int i = 0 ; i< len;i++){
            int pr=1;
            for(int j = 0 ; j< len;j++){
                if(i!=j){
                    pr = pr*nums[j];
                }
            }
            res[i] = pr;
        }

        return res;

         */
        //return res;
    }
}
