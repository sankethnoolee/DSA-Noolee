package lc;

import java.util.HashMap;
import java.util.Map;

public class LeetCode38 {
    public static void main(String[] args) {
        LeetCode38 lc = new LeetCode38();
        lc.countAndSay(4);
    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String rle1op = "1";
        int i = 2;
        while(n>=i){
            rle1op = rle(rle1op);
            i++;
        }
        return rle1op;
    }
    public String rle(String i){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char cur = i.charAt(0);

        for(Character c : i.toCharArray()){
            if(cur!=c){
                sb.append(count).append(cur);
                cur = c;
                count=1;
            }else{count++;}
        }
        sb.append(count).append(cur);
        return sb.toString();
    }
}
