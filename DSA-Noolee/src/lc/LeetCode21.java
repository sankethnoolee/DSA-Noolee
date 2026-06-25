package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //using array merge logic
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return temp.next;
    }


        /*
        //BRUTE FORCE
        List<Integer> res = new ArrayList<>();
        if(l1==null && l2==null){
            return null;
        }
        if(l1!=null){
            while(l1!=null){
                res.add(l1.val);
                l1= l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                res.add(l2.val);
                l2= l2.next;
            }
        }
        Collections.sort(res);
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        for(Integer i: res){
            cur.next=new ListNode(i);
            cur = cur.next;
        }
        return temp.next;

    }*/
}
