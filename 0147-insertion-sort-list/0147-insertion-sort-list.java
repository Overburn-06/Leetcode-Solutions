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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        int count=0;
        ListNode sorted=new ListNode();
        ListNode nhead=sorted;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        for(int i=0;i<count;i++){
            int min=Integer.MAX_VALUE;
            temp=head;
            while(temp!=null){
                min=Math.min(min,temp.val);
                temp=temp.next;
            }
            sorted.next=new ListNode(min);
            sorted=sorted.next;
            ListNode remove=head;
            if(remove.val==min){
                head=head.next;
                continue;
            }
            while(remove!=null && remove.next!=null){
                if(remove.next.val==min){
                    remove.next=remove.next.next;
                    break;
                }
                remove=remove.next;
            }
        }
        return nhead.next;
    }
}