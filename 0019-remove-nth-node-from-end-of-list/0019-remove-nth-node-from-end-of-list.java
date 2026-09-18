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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)return null;
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        if(n==l)return head.next;
        int k=l-n;
        temp=head;
        for(int i=1;i<k;i++){  
            temp=temp.next;
        }
        ListNode next=temp.next;
        temp.next=next.next;
        return head;
    }
}