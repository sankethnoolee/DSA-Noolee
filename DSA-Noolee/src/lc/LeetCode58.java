package lc;

public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int spacePos = s.lastIndexOf(' ');
        if (spacePos == -1) {
            return s.length();
        } else {
            return s.length() - spacePos - 1;
        }
    }
}
