package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode242 {
    public static void main(String[] args) {
        LeetCode242 lc= new LeetCode242();
        lc.isAnagram("cat","rat");
    }
    public boolean isAnagram(String s, String t) {
        // METHOD 4
        //In the prog its given only lower case letters so we map counts of char in arr as below
        int[] az = new int[26];
        //az hold each char by index a-0 , z-25
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl){
            return false;
        }
        for(int i = 0; i<sl; i++){
            //inc first string
            az[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<tl; i++){
            //dec second string
            az[t.charAt(i)-'a']--;
            //the final arr shouldn't go below zero which indicates some char is more in second str
            if(az[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;

        /*
        METHOD 3
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(sArr.length != tArr.length) {
            return false;
        }
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);

         */
        /*
        METHOD 2
        can avoid for loop if inbuild func is used

        for(int i = 0; i< sArr.length; i++) {
            if(sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
        */

        /*
        METHOD 1
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
