package lc;

public class LeetCode50 {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if (power % 2 == 1) { // odd exponent
                result *= x;
            }

            x *= x;
            power /= 2;
        }

        return result;
    }

    /*
    BRUTE FORCE

    public double myPow(double x, int n) {
        double res = 0;

            for(int i = 0; i<n;i++){
                res = res * x;
            }

        return (Integer.signum(n)==-1)?1/res: res;
    }*/
}
