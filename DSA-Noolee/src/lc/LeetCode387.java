package lc;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        //char array strategy
        int [] ia = new int[26];
        for(Character c : s.toCharArray()){
            ia[c-'a']++;
        }
        char[] cArr = s.toCharArray();
        for(int i = 0;i<cArr.length;i++){
            if(1==ia[cArr[i]-'a']){
                return i;
            }
        }
        return -1;
    }
}
