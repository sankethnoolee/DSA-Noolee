package lc;

public class LeetCode86 {
    public ListNode partition(ListNode head, int x) {
        // Dummy nodes to simplify head management of the two lists
        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        // Pointers to track the tail of both sublists
        ListNode smaller = smallerHead;
        ListNode greater = greaterHead;

        // Traverse the original list
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                smaller.next = current;
                smaller = smaller.next;
            } else {
                greater.next = current;
                greater = greater.next;
            }
            current = current.next;
        }

        // Prevent cycles by terminating the greater list
        greater.next = null;

        // Combine the two lists
        smaller.next = greaterHead.next;

        return smallerHead.next;
    }
}
