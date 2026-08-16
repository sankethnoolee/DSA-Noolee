package lc;

public class LeetCode868 {
    public int binaryGap(int n) {
        int maxDistance = 0;
        int lastPosition = -1;
        int currentPosition = 0;

        while (n > 0) {
            // Check if the lowest bit is 1
            if ((n & 1) == 1) {
                // If this is not the first 1 we've seen, update the max distance
                if (lastPosition != -1) {
                    maxDistance = Math.max(maxDistance, currentPosition - lastPosition);
                }
                // Update the position of the last seen 1
                lastPosition = currentPosition;
            }
            // Shift right to check the next bit
            n >>= 1;
            currentPosition++;
        }

        return maxDistance;
    }
}
