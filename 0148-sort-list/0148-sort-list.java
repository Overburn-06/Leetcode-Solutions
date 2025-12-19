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
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergell(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode t1=head1;
        ListNode t2=head2;
        while(t1!=null&&t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        head1=t1;
        head2=t2;
        if(head1!=null){
            temp.next=t1;
        }
        else temp.next=t2;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null) return head;
        ListNode left=head;
        ListNode mid=findmid(head);
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return mergell(left,right);
    }
}