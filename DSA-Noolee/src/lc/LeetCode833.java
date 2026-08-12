package lc;

import java.util.Arrays;

public class LeetCode833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder sb = new StringBuilder(s);

        Integer[] order = new Integer[indices.length];
        for (int i = 0; i < indices.length; i++)
        {
            order[i] = i;
        }

        Arrays.sort(order, (a, b) -> Integer.compare(indices[b], indices[a]));

        for (int i : order){
            String str = sources[i];
            int index = indices[i];
            if (s.startsWith(str, index)){
                sb.replace(index, index + str.length(), targets[i]);
            }
        }
        return sb.toString();

    }
}
