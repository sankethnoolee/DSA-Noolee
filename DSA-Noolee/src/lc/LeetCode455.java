package lc;

import java.util.Arrays;

public class LeetCode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cook = 0;
        while(child<g.length&&cook<s.length){
            if(g[child]<=s[cook]){
                child++;
            }
            cook++;
        }
        return child;
    }
}
