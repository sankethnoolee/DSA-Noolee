package lc;

public class LeetCode434 {
    public int countSegments(String s) {
        if(s.length()==0){return 0;}
        else{
            return (s.trim().split("\\s+")).length;
        }

    }
}
