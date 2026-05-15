package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        //need to learn heap n PQueues before re attempt
        //TODO new topics to cover

        //##BRUTE FORCE
        Map<Integer,Integer> count = new HashMap<>();
        for(int i : nums){
            count.putIfAbsent(i,0);
            count.put(i,count.get(i)+1);
        }
        return count.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
    }
}
