package lc;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    public int romanToInt(String s) {
        Map<String,Integer> lit = new HashMap<String, Integer>();
        lit.put("I",1);
        lit.put("V",5);
        lit.put("X",10);
        lit.put("L",50);
        lit.put("C",100);
        lit.put("D",500);
        lit.put("M",1000);
        String[] cha = s.split("");
        int len = cha.length;
        int res = 0;
        for(int i = 0; i<len ; i++){
            if(i<len-1){
                if(lit.get(cha[i])==lit.get(cha[i+1])){
                    res= res+lit.get(cha[i]);
                }else if(lit.get(cha[i])>lit.get(cha[i+1])){
                    res= res+lit.get(cha[i]);
                }else if(lit.get(cha[i])<lit.get(cha[i+1])){
                    res= res-lit.get(cha[i]);
                }
            }else{

                res= res+ lit.get(cha[i]);

            }
        }
        return res;
    }
}
