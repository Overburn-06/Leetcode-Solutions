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
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode start=head;
        ListNode last=head;
        for(int i=0;i<size-k;i++){
            last=last.next;
        }
       
        for(int i=1;i<k;i++){
            start=start.next;
        }

        int tem=start.val;
        start.val=last.val;
        last.val= tem;
        return head;
    }
}