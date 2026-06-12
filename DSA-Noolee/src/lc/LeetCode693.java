package lc;

public class LeetCode693 {
    public static void main(String[] args) {
        LeetCode693 lc = new LeetCode693();
        lc.hasAlternatingBits(5);
    }
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toString(n,2) ;
        int x = 0;
        for(char c : s.toCharArray()){
            if(c=='1' && x==0){x++;continue;}
            else if(c=='0'&& x==1){
                x--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
