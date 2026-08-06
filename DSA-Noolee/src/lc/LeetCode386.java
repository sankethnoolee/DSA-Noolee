package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode386 {
    public List<Integer> lexicalOrder(int n) {
        List<String> s = new ArrayList<>();
        for(int j = 1;j<=n;j++){
            s.add(String.valueOf(j));
        }
        Collections.sort(s);
        List<Integer> i = new ArrayList<>();
        for(String t : s){
            i.add(Integer.parseInt(t));
        }
        return i;
    }
}
