package lc;

public class LeetCode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int [] jArr = new int [128];
        int count = 0;
        for(char c : jewels.toCharArray()){
            jArr[c-'A']++;
        }
        for(char c : stones.toCharArray()){
            if(jArr[c-'A']>0){
                count++;
            }
        }
        return count;
    }
}
