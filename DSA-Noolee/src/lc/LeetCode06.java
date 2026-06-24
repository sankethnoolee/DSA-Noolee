package lc;

public class LeetCode06 {
    public String convert(String s, int numRows) {
        StringBuilder [] sArr = new StringBuilder[numRows];
        StringBuilder res = new StringBuilder();
        boolean goingdown = false;
        int row = 0;
        for(char c:s.toCharArray()){
            sArr[row]=sArr[row]==null?new StringBuilder():sArr[row];
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
