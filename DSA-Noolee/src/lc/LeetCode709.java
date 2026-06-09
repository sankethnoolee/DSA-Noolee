package lc;

public class LeetCode709 {
    public String toLowerCase(String s) {
        //BRUTE FORCE
        //s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) ((int) c + 32);
            }
            result.append(c);
        }

        return result.toString();
    }
}
