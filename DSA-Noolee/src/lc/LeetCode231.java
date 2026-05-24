package lc;

public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {

        if( n == 0 ) return false;
        int r = 0;

        while( n > 1 ){
            r = n % 2;
            if( r != 0 ) return false;
            n = n / 2;
        }
        return n == 1 ?  true : false;
    }
}
