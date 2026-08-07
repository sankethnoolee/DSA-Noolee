package lc;

public class LeetCode605 {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(n==0){
            return true;
        }
        for(int i = 0; i<fb.length;i++){
            boolean l = (i==0)||(fb[i-1]==0);
            boolean r = (i==fb.length-1)||(fb[i+1]==0);

            if(fb[i]==0 && l && r){
                fb[i]=1;
                n--;
                if(n==0){
                    return true;
                }
            }

        }
        return n<=0;
    }
}
