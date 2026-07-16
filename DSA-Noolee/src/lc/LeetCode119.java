package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        /*if(rowIndex==0){
            return new ArrayList<>();
        }*/
        for(int i = 0; i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0 || i==j){
                    row.add(1);
                }else{
                    List<Integer> pr = res.get(i-1);
                    row.add(pr.get(j)+pr.get(j-1));
                }
            }
            res.add(row);
        }
        return res.get(rowIndex);
    }
}
