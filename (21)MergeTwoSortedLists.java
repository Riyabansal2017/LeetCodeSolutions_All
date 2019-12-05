//21. Merge Two Sorted Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode start1, ListNode start2) {
      
        ListNode start3 = new ListNode(0);
        ListNode head = start3;
        while(start1!=null || start2!=null)
        {
            if(start1==null)
            {
                start3.next = start2;
                return head.next;
            }
            if(start2==null) {
                start3.next = start1;
                return head.next;
            }
            if(start1.val<start2.val)
            {
                start3.next = new ListNode(start1.val);
                start1 = start1.next;
            }
            else
            {
                start3.next = new ListNode(start2.val);
                start2 = start2.next;
            }
            start3 = start3.next;
        }
        return head.next;
    }
}