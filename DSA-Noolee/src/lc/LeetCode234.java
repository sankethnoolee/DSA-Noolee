package lc;

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> t = new ArrayList<>();
        while(head!=null){
            t.add(head.val);
            head = head.next;
        }
        int i=0;int j = t.size()-1;
        while(i<j){
            if(t.get(i)!=t.get(j)){
                return false;
            }else{
                i++;j--;
            }
        }
        return true;
    }
}
