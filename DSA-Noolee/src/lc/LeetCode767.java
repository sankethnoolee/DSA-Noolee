package lc;

public class LeetCode767 {
    public String reorganizeString(String s) {
        int [] charArr = new int[26];
        int l = s.length();
        for(char c : s.toCharArray()){
            charArr[c-'a']++;
        }
        int maxChar = 0;
        int maxCount = 0;
        for(int i = 0 ; i<26;i++){
            if(charArr[i]>maxCount){
                maxCount = charArr[i];
                maxChar = i;
            }
        }
        if(maxCount>(l+1)/2){
            return "";
        }
        char [] res = new char[l];
        int index = 0;
        while (charArr[maxChar] > 0) {
            res[index] = (char)(maxChar + 'a');
            index += 2;
            charArr[maxChar]--;
        }
        for(int i = 0;i<26;i++){
            while(charArr[i]>0){
                if(index>=l){
                    index = 1;
                }
                res[index] = (char)(i+'a');
                index = index+2;
                charArr[i]--;
            }
        }
        return new String(res);
    }
}
