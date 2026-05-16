package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode36 {
    public boolean isValidSudoku(char[][] board) {
        //init i was confused that i was supposed to solve the suduko
        //after understanding we just need to validate the uniqueness accross
        //the dots are to be ignored rest of the values should be validated for unqui in each row and column n subgrid
        // honestly subgrid logic i took help
        //so here we go
        //still needs to be optimised
        //TODO comeback after DSA


        Set<String> unique = new HashSet<>();
        //limits are hard coded since prob statement is 3*3 suduko
        for(int i = 0 ; i <9;i++){
            for (int j = 0 ; j< 9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                //unique in row
                if(!unique.add(board[i][j]+"#value in row#"+i)){
                    return false;
                }

                //unique in col
                if(!unique.add(board[i][j]+"#value in col#"+j)){
                    return false;
                }

                //unique in subgrid
                if(!unique.add(board[i][j]+"#value in sub#"+(i/3)+(j/3))){
                    return false;
                }
            }

        }
        return true;
    }
}
