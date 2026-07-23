package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode401 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();

        // Loop through every possible hour and minute combination
        for(
                int h = 0;
                h< 12;h++)

        {
            for (int m = 0; m < 60; m++) {
                // Count total set bits (1s) in the binary representation of h and m
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    // Format minutes to always be two digits (e.g., 0 -> "00", 5 -> "05")
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }

        return times;
    }
}
