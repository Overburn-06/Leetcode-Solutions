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
    public ListNode reverse(ListNode last,ListNode head,int n){
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=temp.next;
        while(temp!=null&&n>0){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            n--;
        }
        head.next=next;
        last.next=prev;
        return head;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev=dummy;
        int gn=1;
        while(curr!=null){
            int count=0;
            ListNode temp=curr;
            while(temp!=null&&count<gn){
                temp=temp.next;
                count++;
            }
            if(count%2==0){
                prev=reverse(prev,curr,count);
                curr=prev.next;
            }else{
                for(int i=0;i<count;i++){
                    prev=curr;
                    curr=curr.next;
                }
            }
            gn++;
        }
        return dummy.next;
    }
}