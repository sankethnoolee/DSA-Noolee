package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Map to store strings from list1 and their corresponding indices
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Traverse list2 to find common strings and track the minimum index sum
        for (int j = 0; j < list2.length; j++) {
            String restaurant = list2[j];

            if (map.containsKey(restaurant)) {
                int i = map.get(restaurant);
                int currentSum = i + j;

                // If a smaller index sum is found, clear previous results and update minSum
                if (currentSum < minSum) {
                    minSum = currentSum;
                    result.clear();
                    result.add(restaurant);
                }
                // If the sum matches the current minimum, append it to the results
                else if (currentSum == minSum) {
                    result.add(restaurant);
                }
            }
        }

        // Convert the dynamically allocated list back to a primitive string array
        return result.toArray(new String[0]);
    }
}
