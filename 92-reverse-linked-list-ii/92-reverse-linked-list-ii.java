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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode new_head = new ListNode(0);
        new_head.next = head;
        ListNode pre = new_head;
        
        
        
        for(int i=0; i<left-1; i++) pre = pre.next;
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for(int i=0;i<right-left;i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return new_head.next;
            
    }
}