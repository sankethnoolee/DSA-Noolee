package lc;

public class LeetCode141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            // Edge case: an empty list or a list with only one node cannot have a cycle
            if (head == null || head.next == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;

            // Move fast by 2 steps and slow by 1 step
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // If they meet, a cycle exists
                if (slow == fast) {
                    return true;
                }
            }

            // If fast reaches the end, there is no cycle
            return false;
        }
    }
}
