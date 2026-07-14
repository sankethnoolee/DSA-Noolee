package lc;

import java.util.*;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        Map<Integer,List<String>> mainMap = new HashMap<>();
        mainMap.put(2, Arrays.asList(new String[] {"a","b","c"}));
        mainMap.put(3, Arrays.asList(new String[] {"d","e","f"}));
        mainMap.put(4, Arrays.asList(new String[] {"g","h","i"}));
        mainMap.put(5, Arrays.asList(new String[] {"j","k","l"}));
        mainMap.put(6, Arrays.asList(new String[] {"m","n","o"}));
        mainMap.put(7, Arrays.asList(new String[] {"p","q","r","s"}));
        mainMap.put(8, Arrays.asList(new String[] {"t","u","v"}));
        mainMap.put(9, Arrays.asList(new String[] {"w","x","y","z"}));

        List<String> res = new ArrayList<String>();
        for(String s : digits.split("")){
            if(!"".equalsIgnoreCase(s.trim())){
                res = combo(res,mainMap.get(Integer.parseInt(s)));
            }

        }
        return res;

    }
    public List<String> combo(List<String> res, List<String> mainMap){
        List<String> temp = new ArrayList<String>();
        for(String m : mainMap){
            if(res.size()==0){
                temp.add(m);
            }else{
                for(String r : res){
                    temp.add(r+m);
                }
            }

        }
        return temp;
    }
}
