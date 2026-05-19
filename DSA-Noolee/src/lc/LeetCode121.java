package lc;

public class LeetCode121 {
    public int maxProfit(int[] prices) {

        int max = 0;
        int buy = prices[0];
        for(int i =1; i<prices.length;i++){
            int curProf = prices[i]-buy;
            if(curProf>max){
                max = curProf;
            }
            if(buy>prices[i]){
                buy = prices[i];
            }
        }
        return max;


        /*
        //BRUTE FORCE
        //PAsses sample but times out for bigger array
        //So using 2pointer single loop
        int max = 0;
        for(int i = 0; i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                int prof = prices[j]-prices[i];
                max = Math.max(max,prof);
            }
        }
        return max;

         */
    }
}
