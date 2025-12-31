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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode Next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=Next;
        }
        return prev;
    }
    public ListNode Kthnode(ListNode head,int k){
        ListNode temp=head;
        for(int i=1;i<k;i++){
            if(temp==null) return null;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthnode=Kthnode(temp,k);
            if(kthnode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(head==temp){
                head=kthnode;
            }else{
                prev.next=kthnode;
            }
            prev=temp;
            temp=nextnode;
        }
        return head;
    }
}