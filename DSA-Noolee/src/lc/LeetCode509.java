package lc;

public class LeetCode509 {
    public int fib(int n) {

        if(n<1){
            return n;
        }
        int prev1=1;
        int prev2=0;
        for(int i = 2; i<=n;i++){
            int c = prev1+prev2;
            prev2=prev1;
            prev1=c;

        }
        return prev1;
    }
}
