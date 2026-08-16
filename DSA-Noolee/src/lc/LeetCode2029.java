package lc;

public class LeetCode2029 {
    public boolean stoneGameIX(int[] stones) {
        // Step 1: Count frequencies of remainders when divided by 3
        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }

        // Step 2: Analyze game based on the parity of type-0 stones
        if (count[0] % 2 == 0) {
            // Even number of zeros: Zeros cancel out.
            // Alice needs both type-1 and type-2 stones to navigate safely.
            return Math.min(count[1], count[2]) > 0;
        } else {
            // Odd number of zeros: Zeros change turn parity.
            // Alice can force a win if the difference between types is significant.
            return Math.abs(count[1] - count[2]) > 2;
        }
    }
}
