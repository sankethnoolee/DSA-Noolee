package lc;

public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {

        int j = 0;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for(int i = 0;i< sa.length;i++){
            while(j<ta.length){
                if(sa[i]==ta[j]){
                    break;
                }
                j++;
            }
            if (j == ta.length) {
                return false;
            }
            j++;
        }
        return true;
    }
}
