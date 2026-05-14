package lc;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Trying by hashing string instead of sorting each string
        //although my earlier solution gave faster in leetcode
        //this frquency based approach.

        Map<String,List<String>> uni = new HashMap<>();
        for(String s : strs){
            String hash = hashMyString(s);
            uni.computeIfAbsent(hash, k -> new ArrayList<>()).add(s);
            if(!uni.containsKey(hash)){
                uni.put(hash,new ArrayList<>());
            }
            uni.get(hash).add(s);
        }

        return new ArrayList<>(uni.values());
        /*
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
        */
    }

    private String hashMyString(String s) {

        //just auto boxing improved the perf by 25%
        int [] ia = new int[26];
        for(Character c : s.toCharArray()){
            ia[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(Integer i : ia){
            sb.append(i).append("#");
        }
        return sb.toString();
    }

}
