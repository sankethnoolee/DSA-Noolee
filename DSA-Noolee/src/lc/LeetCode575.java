package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique = new HashSet<>();
        for(Integer i : candyType){
            unique.add(i);
        }
        int n = candyType.length/2;
        if(unique.size()<n){
            return unique.size();
        }
        if(unique.size()>=n){
            return n;
        }
        return 0;
    }
}
