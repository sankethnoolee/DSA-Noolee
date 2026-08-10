package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> dp = new HashMap<>();
        for(String s : cpdomains){
            Integer count = Integer.parseInt((s.split(" "))[0]);
            String dom = (s.split(" "))[1];
            String[] subArr = dom.split("\\.");
            for (int i = 0; i < subArr.length; i++) {

                StringBuilder subDomain = new StringBuilder();

                for (int j = i; j < subArr.length; j++) {
                    if (subDomain.length() > 0) {
                        subDomain.append(".");
                    }
                    subDomain.append(subArr[j]);
                }

                String key = subDomain.toString();

                dp.put(key, dp.getOrDefault(key, 0) + count);
            }
        }
        List<String> res = new ArrayList<>();
        for(String k : dp.keySet()){
            res.add(dp.get(k)+" "+k);
        }
        return res;
    }
}
