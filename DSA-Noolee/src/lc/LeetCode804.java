package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> u = new HashSet<String>();
        for(String s : words){
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                sb.append(morse[c-'a']);
            }
            u.add(sb.toString());
        }

        return u.size();

    }
}
