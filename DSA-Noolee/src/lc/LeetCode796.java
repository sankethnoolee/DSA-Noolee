package lc;

public class LeetCode796 {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
