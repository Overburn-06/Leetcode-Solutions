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
    public ListNode partition(ListNode head, int x) {
        ListNode lesser=new ListNode();
        ListNode less=lesser;
        ListNode bigger=new ListNode();
        ListNode big=bigger;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                less.next=new ListNode(temp.val);
                less=less.next;
            }else{
                big.next=new ListNode(temp.val);
                big=big.next;
            }
            temp=temp.next;
        }
        less.next=bigger.next;
        return lesser.next;
    }
}