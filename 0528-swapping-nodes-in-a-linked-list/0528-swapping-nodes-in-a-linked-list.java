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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode start=head;
        ListNode end=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        ListNode fast=start;
        while(fast.next!=null){
            end=end.next;
            fast=fast.next;
        }
        int t=start.val;
        start.val=end.val;
        end.val=t;
        return head;
    }
}