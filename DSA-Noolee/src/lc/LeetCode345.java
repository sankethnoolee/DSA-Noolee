package lc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode345 {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        Character [] v = {'a','e','i','o','u','A','E','I','O','U'};
        Collections.addAll(vowels, v);
        int i = 0;
        int j = s.length()-1;
        char [] str = s.toCharArray();
        while(i<j){
            if(!vowels.contains(str[i])){
                i++;
            } else if (!vowels.contains(str[j])) {
                j--;
            } else if (vowels.contains(str[i]) && vowels.contains(str[j])) {
                char t = str[i];
                str[i] = str[j];
                str[j] = t;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}
