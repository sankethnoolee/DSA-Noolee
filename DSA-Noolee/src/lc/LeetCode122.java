package lc;

public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int prof = 0;
        for(int i = 0;i<n-1;i++){
            if(prices[i+1]-prices[i]>0){
                prof = prof+(prices[i+1]-prices[i]);
            }
        }
        return prof;
    }
}
