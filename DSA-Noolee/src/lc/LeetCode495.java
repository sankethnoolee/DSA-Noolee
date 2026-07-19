package lc;

public class LeetCode495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
            return 0;
        }

        int totalPoisonedTime = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Add the overlapping time between consecutive attacks
            totalPoisonedTime += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }

        // Add the full duration for the final attack
        totalPoisonedTime += duration;

        return totalPoisonedTime;
    }
}
