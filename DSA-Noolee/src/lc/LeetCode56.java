package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int []> res = new ArrayList<>();
        int [] current = intervals[0];
        res.add(current);

        for(int[] i : intervals){
            int cs = current[0];
            int ce = current[1];
            int ns = i[0];
            int ne = i[1];
            if(cs<=ns && ns<=ce){
                current[1] = Math.max(ce,ne);
            }else{
                current = i;
                res.add(current);

            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
