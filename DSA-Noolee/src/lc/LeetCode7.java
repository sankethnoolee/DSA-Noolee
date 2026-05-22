package lc;

import java.math.BigInteger;

public class LeetCode7 {
    public static void main(String[] args) {
        LeetCode7 lc = new LeetCode7();
        lc.reverse(123);
    }
    public int reverse(int x) {
        try {
            int res = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(x);
            boolean neg = false;
            if(sb.charAt(0)=='-'){
                neg = true;
            }
            sb.reverse();
            if(neg){
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, '-');
            }
            res = Integer.parseInt(sb.toString());
            return res;
        }catch (Throwable e){
            return 0;
        }
    }
}
