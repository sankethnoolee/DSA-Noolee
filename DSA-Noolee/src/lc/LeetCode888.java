package lc;

import java.util.HashSet;
import java.util.Set;

public class LeetCode888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> setB = new HashSet<>();

        // Calculate total candy for Alice
        for (int a : aliceSizes) {
            sumA += a;
        }

        // Calculate total candy for Bob and populate the HashSet
        for (int b : bobSizes) {
            sumB += b;
            setB.add(b);
        }

        // Find the difference delta
        int delta = (sumB - sumA) / 2;

        // Search for the valid swap pair
        for (int a : aliceSizes) {
            int targetB = a + delta;
            if (setB.contains(targetB)) {
                return new int[]{a, targetB};
            }
        }

        return new int[0];
    }
}
