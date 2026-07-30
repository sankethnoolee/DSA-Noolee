package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        char [] chars = s.toCharArray();
        int count = 0;
        char c = chars[0];
        int start = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i<chars.length;i++){
            if(c == chars[i]){
                count++;
            }else{
                if(count>=3){
                    List<Integer> ind = new ArrayList<>();
                    ind.add(start);ind.add(i-1);
                    res.add(ind);
                }
                start = i;
                count = 1;
                c = chars[i];
            }
        }
        if(count>=3){
            List<Integer> ind = new ArrayList<>();
            ind.add(start);ind.add(chars.length-1);
            res.add(ind);
        }
        return res;
    }
}
