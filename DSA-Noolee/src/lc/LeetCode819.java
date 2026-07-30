package lc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String [] para = paragraph.split("\\s+");
        Set<String> ban = new HashSet<String>();
        for(String s : banned){
            ban.add(s);
        }
        Map<String,Integer> cMap = new HashMap<String,Integer>();
        int maxCount = 0;
        String maxStr = "";
        for(String s : para){
            if(s.isEmpty() || ban.contains(s)){continue;}
            int count = cMap.getOrDefault(s,0)+1;
            cMap.put(s,count);
            if(count>maxCount){
                maxCount = count;
                maxStr = s;
            }
        }
        return maxStr;
    }
}
