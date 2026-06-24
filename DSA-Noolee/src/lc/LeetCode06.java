package lc;

public class LeetCode06 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder [] sArr = new StringBuilder[numRows];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sArr[i] = new StringBuilder();
        }
        boolean goingdown = false;
        int row = 0;
        for(char c:s.toCharArray()){
            sArr[row].append(c);
            if(row==0){
                goingdown=true;
            }else if (row == numRows - 1){
                goingdown=false;
            }
            row = row + (goingdown?1:-1);
        }
        for(StringBuilder sb : sArr){
            res.append(sb);
        }
        return res.toString();
    }
}
