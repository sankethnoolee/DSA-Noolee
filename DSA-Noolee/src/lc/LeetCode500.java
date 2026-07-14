package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode500 {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<String>();
        String r1 = "QWERTYUIOPqwertyuiop";
        String r2 = "ASDFGHJKLasdfghjkl";
        String r3 = "ZXCVBNMzxcvbnm";
        int i =0 ;
        for(String s : words){
            if(s.matches("[" + r1 + "]+") || s.matches("[" + r3 + "]+") || s.matches("[" + r2 + "]+")){
                res.add(s);
                i++;
            }
        }
        return res.toArray(String[]::new);
    }
}
