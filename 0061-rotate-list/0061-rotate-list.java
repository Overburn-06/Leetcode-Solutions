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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        k=k%count;
        if(k==0) return head;
        for(int i=1;i<count-k;i++){
            temp=temp.next;
        }
        ListNode next=temp.next;
        temp.next=null;
        ListNode curr=next;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        return next;
    }
}