package lc;

public class LeetCode657 {
    public boolean judgeCircle(String moves) {
        //now trying with simpler way
        // TODO REMEMBER each if costs more than else if
        //TODO primitives work faster than boxing
        int x = 0;
        int y = 0;
        for(Character c : moves.toCharArray()){
            if(c=='U')y++;
            else if(c=='D')y--;
            else if(c=='L')x--;
            else if(c=='R')x++;
        }
        return ((x==0)&&(y==0));

        //BRUTE FORCE trying with switch
        /*int [] init = {0,0};
        for(Character c : moves.toCharArray()){
            switch (c) {
                case 'L':
                    init[0]=init[0]-1;
                    break;
                case 'R':
                    init[0]=init[0]+1;
                    break;
                case 'U':
                    init[1]=init[1]+1;
                    break;
                case 'D':
                    init[1]=init[1]-1;
                    break;
                default:
                    break;
            }
            System.out.println(init[0]+"--"+init[1]);
        }
        return (init[0]==0 && init[1]==0);

        */
    }
}
