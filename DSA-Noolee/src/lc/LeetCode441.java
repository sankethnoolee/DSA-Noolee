package lc;

public class LeetCode441 {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsUsed = mid * (mid + 1) / 2;

            if (coinsUsed <= n) {
                ans = mid;
                left = mid + 1; // Try to find a larger number of rows
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
    //above is copied
    //brute force
    /*int row = 1;
    while(n>=row){
        n = n-row;
        row++
    }
    return row;*/

}
