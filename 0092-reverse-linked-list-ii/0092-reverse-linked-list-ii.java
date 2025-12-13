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
        ListNode temp1=head;
        ListNode temp2=head;
        if(head==null||left==right) return head;
        for(int i=1;i<left;i++){
            temp1=temp1.next;
        }
        for(int i=1;i<right;i++){
            temp2=temp2.next;
        }
        ListNode prev= new ListNode(-1);
        prev.next=head;
        ListNode dummy=prev;
        for(int i=1;i<left;i++){
            dummy=dummy.next;
        }
        ListNode last=temp2.next;
        ListNode nhead=reverse(temp1,temp2);
        dummy.next=nhead;
        temp1.next=last;
        return prev.next;
        
    }
    public ListNode reverse(ListNode head,ListNode tail){
        ListNode temp=head;
        ListNode prev=null;
        while(prev!=tail){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}