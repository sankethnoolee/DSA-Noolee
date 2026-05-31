package lc;

public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        int [] ia = new int[26];
        for(Character c : s.toCharArray()){
            ia[c-'a']++;
        }
        for(Character c : t.toCharArray()){
            ia[c-'a']--;
        }
        for(int i = 0;i<ia.length;i++){
            if(0>ia[i]){
                return (char)('a'+i);
            }
        }
        return '0';
    }
}
