package lc;

public class LeetCode48 {
    public void rotate(int[][] m) {
        int n = m.length;
        //transpose
        for(int i = 0;i<n;i++){
            for(int j = i+1; j<n;j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }

        //reverse
        for(int i =0;i<n;i++){
            int l = 0;
            int r = n-1;
            while(l<r){
                int temp = m[i][l];
                m[i][l] = m[i][r];
                m[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}
