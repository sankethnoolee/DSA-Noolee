package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int totalElements = 1 << n; // Equivalent to 2^n

        for (int i = 0; i < totalElements; i++) {
            // Standard binary-to-gray conversion formula
            result.add(i ^ (i >> 1));
        }

        return result;
    }
}
