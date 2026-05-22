package lc;

public class LeetCode739 {
    public static void main(String[] args) {
        LeetCode739 lc = new LeetCode739();
        lc.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int j=1,i = 0;
        while (i<temperatures.length) {
            int days = 0;
            j = i+1;

                days++;
                if (temperatures[j] > temperatures[i]) {
                    res[i] = days;
                    break;
                } else {
                    j++;
                }

        }
        return res;

        /*
        BRUTEFORCE passed basic test cases

        int[] res = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            int days = 0;
            for(int j = i+1; j< temperatures.length;j++){
                days++;
                if(temperatures[j]>temperatures[i]){
                    res[i]= days;
                    break;
                }
            }
        }
        return res;

         */
    }
}
