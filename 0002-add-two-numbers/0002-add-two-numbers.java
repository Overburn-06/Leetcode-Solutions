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
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        int sum=0;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(temp1!=null||temp2!=null){
            int x;
            int y;
            if(temp1!=null){
                x=temp1.val;
            }else{
                x=0;
            }
            if(temp2!=null){
                y=temp2.val;
            }else{
                y=0;
            }
            sum=x+y+carry;
            if(sum>9){
                curr.next=new ListNode(sum%10);
                carry=sum/10;
            }else{
                carry=0;
                curr.next=new ListNode(sum);
            }
            curr=curr.next;
            if(temp1!=null)temp1=temp1.next;
            if(temp2!=null)temp2=temp2.next;
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
       
        return dummy.next;
    }
}