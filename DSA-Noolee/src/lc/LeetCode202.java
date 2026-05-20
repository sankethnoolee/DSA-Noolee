package lc;

public class LeetCode202 {
    //This is BRUTE FORCE
    //TODO revist after theory
    public static void main(String[] args) {
        LeetCode202 lc = new LeetCode202();
        lc.isHappy(1111111);
    }
    public boolean isHappy(int n) {
        String[] sArr  = (n+"").split("");
        Integer res = 0;
        if(sArr.length==1 && Integer.parseInt(sArr[0])==1){
            res = n;
        }else if(sArr.length==1){
            sArr  = ((n*n)+"").split("");
        }
        int cyc = 0;
        while(sArr.length!=1 || cyc==1){
            cyc++;
            res= calc(sArr);
            sArr = (res+"").split("");
        }

        if(res ==1){
            return true;
        }else{
            return false;
        }

    }

    public Integer calc(String [] sArr){


            int sum=0;
            for(int i = 0;i<sArr.length;i++){
                sum = sum+(Integer.parseInt(sArr[i])*Integer.parseInt(sArr[i]));
            }
            return sum;

    }
}
