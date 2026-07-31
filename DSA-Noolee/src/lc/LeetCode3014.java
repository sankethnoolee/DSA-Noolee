package lc;

public class LeetCode3014 {
    //BRUTE FORCE
    public int minimumPushes(String word) {
        /*
        * same simplified
        *
        int count = 0;
        int l = word.length();
        int round = 1;
        while(l>0){
            int cur = Math.min(8,l);
            count += cur*round;
            l-=cur;
            round++;
        }
        return count;
        * */
        int count = 0;
        int l = word.toCharArray().length;
        int round = 1;
        while(l>0){
            if(l>=8 && round==1){
                count+=8;
                l = l-8;
            }else if(l>=8 && round==2){
                count+=8*2;
                l = l-8;
            }else if(l>=8 && round==3){
                count+=(8*3);
                l = l-8;
            }else if(round==4){
                count += l*4;
                l=0;
            }else if(l<8 && round==1){
                count+=l;
                l = 0;
            }else if(l<8 && round==2){
                count+=l*2;
                l = 0;
            }else if(l<8 && round==3){
                count+=l*3;
                l = 0;
            }
            round++;
        }
        return count;
    }
}
