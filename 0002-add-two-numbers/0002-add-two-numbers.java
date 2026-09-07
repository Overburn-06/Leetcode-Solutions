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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c1=1;
        int c2=1;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1.next!=null){
            c1++;
            temp1=temp1.next;
        }
        while(temp2.next!=null){
            c2++;
            temp2=temp2.next;
        }
        if(c1<c2){
            while(c1!=c2){
                temp1.next=new ListNode(0);
                temp1=temp1.next;
                c1++;
            }
        }else{
             while(c1!=c2){
                temp2.next=new ListNode(0);
                temp2=temp2.next;
                c2++;
            }
        }
        int sum=0;
        ListNode t1=l1;
        ListNode t2=l2;
        int carry=0;
        ListNode ans=new ListNode();
        ListNode curr=ans;
        ListNode head=ans;
        for(int i=0;i<Math.max(c1,c2);i++){
            int n1=t1.val;
            int n2=t2.val;
            int s=n1+n2+carry;
            if(s>9){
                carry=1;
            }else{
                carry=0;
            }
            curr.next=new ListNode(s%10);
            t1=t1.next;
            t2=t2.next;
            curr=curr.next;
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }
}