package lc;

public class LeetCode825 {
    public int numFriendRequests(int[] ages) {
        //array idx approach
        int l = ages.length;
        int c = 0;
        int [] age = new int[121];
        for(int i = 0;i<l;i++){
            age[ages[i]]++;
        }
        for(int i = 0; i<=120;i++){
            if(age[i]==0){continue;}
            for(int j = 0 ; j<=120;j++){
                if(age[j]==0){continue;}
                if(j<=(0.5*i+7)){
                    continue;
                }
                if(j>i){
                    continue;
                }
                if(j>100 && i<100){
                    continue;
                }
                c += age[i]*age[j];
                if(i==j){
                    c-=age[i];
                }
            }

        }
        return c;
    }
}
