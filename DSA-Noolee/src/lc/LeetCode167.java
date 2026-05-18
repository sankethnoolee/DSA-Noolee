package lc;

import java.util.HashMap;
import java.util.Map;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> rem = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            if(rem.containsKey(target-numbers[i])){
                return new int[]{rem.get(target-numbers[i]),i+1};
            }
            rem.put(numbers[i],i+1);
        }
        return new int[]{-1,-1};
    }
}
