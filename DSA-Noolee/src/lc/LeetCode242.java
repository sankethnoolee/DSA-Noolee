package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(sArr.length != tArr.length) {
            return false;
        }
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
        /*
        can avoid for loop if inbuild func is used

        for(int i = 0; i< sArr.length; i++) {
            if(sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
        */

        /*
        using hashmaps

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>  sMap= new HashMap<Character,Integer>();
        Map<Character,Integer>  tMap= new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }else{
                sMap.put(s.charAt(i),1);
            }
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            }else{
                tMap.put(t.charAt(i),1);
            }
        }
        for(Character c : sMap.keySet()){
            if(!tMap.containsKey(c) || (!sMap.get(c).equals(tMap.get(c)))){
                return false;
            }
        }
        return true;*/
    }
}
