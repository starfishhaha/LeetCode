/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//recursion 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln = null;
        //base case
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        //glue case
        else{
            if(l1.val > l2.val){
                ln = l2;
                ln.next =  mergeTwoLists(l1,l2.next);
            }
            else{
                ln = l1;
                ln.next =  mergeTwoLists(l1.next,l2);
            }
        }
        return ln;
        
    }
}
