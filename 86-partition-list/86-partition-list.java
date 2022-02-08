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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode less = new ListNode(0);
        ListNode lHead = less;
        ListNode greater = new ListNode(0);
        ListNode gHead = greater;
        
        while(head!=null){
            if(head.val<x){
                less.next = head;
                less = less.next;
            }
            else{
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }
        greater.next = null;
        less.next = gHead.next;
        return lHead.next;
    }
}