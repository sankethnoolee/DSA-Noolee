package lc;

public class LeetCode557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        String [] sa = s.split(" ");
        for(String st : sa){
            sb = new StringBuilder(st).reverse();
            res.append(sb).append(" ");
        }
        return res.toString().trim();
    }
}
