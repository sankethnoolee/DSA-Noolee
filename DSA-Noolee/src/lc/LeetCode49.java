package lc;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        //#TODO  HASHING TECHNIQUE

        //#Brute force
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> uni = new HashMap<>();
        for(int i =0; i<strs.length;i++){
            char[] str =strs[i].toCharArray();
            Arrays.sort(str);
            String sortedStr = String.valueOf(str);
            if(!uni.containsKey(sortedStr)){
                uni.put(sortedStr,new ArrayList<String>());
            }
            uni.get(sortedStr).add(strs[i]);
        }
        for(String s : uni.keySet()){
            res.add(uni.get(s));
        }

        return res;
    }

}
