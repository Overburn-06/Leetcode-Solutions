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
        if(head.next==null) return head;
        if(left==right) return head;
        ListNode prev_left=head;
        ListNode next_right=head;
        ListNode left_temp=head;
        ListNode right_temp=head;
        for(int i=1;i<left-1;i++){
            prev_left=prev_left.next;
        }
        for(int i=1;i<right;i++){
            right_temp=right_temp.next;
        }
        next_right=right_temp.next;
        right_temp.next=null;
        if(left==1){
            ListNode rhead=reverse(left_temp);
            head.next=next_right;
            return rhead;
        }
        left_temp=prev_left.next;
        ListNode rhead=reverse(left_temp);
        prev_left.next=rhead;
        left_temp.next=next_right;
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