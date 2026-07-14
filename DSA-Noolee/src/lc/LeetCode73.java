package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode73 {
    public void setZeroes(int[][] matrix) {

        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();

        for(int i = 0; i < matrix[0].length; i++){

            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] == 0){
                    rowList.add(j);
                    colList.add(i);
                }
            }
        }

        for(Integer col: colList){
            for(int i = 0; i < matrix.length; i++)
                matrix[i][col] = 0;
        }



        for(Integer col: rowList){
            for(int i = 0; i < matrix[0].length; i++)
                matrix[col][i] = 0;
        }

    }
}
