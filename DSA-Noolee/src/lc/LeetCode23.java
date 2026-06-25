package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> res = new ArrayList<>();
        for(ListNode l : lists){
            if(l==null){
                continue;
            }
            while(l!=null){
                res.add(l.val);
                l = l.next;
            }

        }
        if (res.isEmpty()) {
            return null;
        }
        Collections.sort(res);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : res) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}
