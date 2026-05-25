package lc;

public class LeetCode258 {
    public int addDigits(int n) {


        int x = 0;
        while (n > 0) {
            x += ((n % 10) * (n % 10));
            n = n / 10;
        }
        if(n<=9){
            return n;
        }

        return addDigits(x);
    }
}
