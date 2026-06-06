package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode506 {
    public String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        Map<Integer,Integer> index = new HashMap<>();
        for(int i = 0; i<score.length;i++){
            index.put(score[i],i);
        }
        Arrays.sort(score);

        res[index.get(score[score.length-1])]="Gold Medal";
        if(score.length>1)res[index.get(score[score.length-2])]="Silver Medal";
        if(score.length>2)res[index.get(score[score.length-3])]="Bronze Medal";
        for(int i = score.length-4;i>=0;i--){
            res[index.get(score[i])]=(score.length - i)+"";
        }
        return res;
    }
}
