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
        if(head==null||head.next==null)return head;
        if(k==0) return head;
        int size=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            size++;
        }
        ListNode temp=head;
        k=k%size;
        if(k==0) return head;

        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }
        ListNode nhead=temp.next;
        temp.next=null;
        last.next=head;
        
        return nhead;
    }
}