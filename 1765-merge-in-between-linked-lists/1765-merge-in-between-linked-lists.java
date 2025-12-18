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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list1;
        for(int i=1;i<a;i++){
            t1=t1.next;
        }
        for(int i=0;i<b;i++){
            t2=t2.next;
        }
        t1.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t2.next;
        return list1;
    }
}