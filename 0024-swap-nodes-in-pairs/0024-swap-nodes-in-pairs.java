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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        head=head.next;
        ListNode prev=null;
        while(slow!=null && slow.next!=null){
            ListNode fast=slow.next;
            ListNode next=fast.next;
            fast.next=null;
            ListNode rhead=reverse(slow);
            if(prev!=null){
                prev.next = rhead;
            }
            prev=slow;
            slow.next=next;
            slow=next;
        }
        return head;
    }
    ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}