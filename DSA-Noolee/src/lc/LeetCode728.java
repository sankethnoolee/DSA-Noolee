package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(isSelf(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isSelf(int n){
        int temp = n;

        while (temp>0){
            int digit = n%10;
            if(digit==0 || n%digit!=0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
