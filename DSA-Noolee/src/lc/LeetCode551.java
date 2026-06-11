package lc;

public class LeetCode551 {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for(Character c : s.toCharArray()){
            if(c=='A'){
                a++;
                l=0;
            }
            if(c=='L'){
                l++;
            }
            if(c=='P'){
                l=0;
            }
            if(a>=2 || l>=3){
                return false;
            }
        }
        return true;
    }
}
