package lc;

public class LeetCode717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int l = bits.length;
        while(i<l-1){
            if(bits[i]==1){
                i+=2;
            }else{
                i+=1;
            }
        }
        return i==l-1;
    }
}
