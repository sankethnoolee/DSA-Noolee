package lc;

public class LeetCode374 {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (guess(mid)==-1) {
                r = mid;
            } else if(guess(mid)==1){
                l = mid + 1;
            } else if(guess(mid)==0){
                return mid;
            }
        }
        return l;
    }

    private int guess(int mid) {
        return 0;
    }
}
