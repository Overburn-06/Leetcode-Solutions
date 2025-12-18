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
    public ListNode[] splitListToParts(ListNode head, int k) {
  ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        ListNode res[] = new ListNode[k];
        int length=size/k;
        int extra=size%k;
        temp=head;
        for(int i=0;i<k;i++){
            if(temp==null) return res;
            int count=0;
            ListNode currh=temp;
            ListNode prev=null;
            while(temp!=null&&count<length){
                prev=temp;
                temp=temp.next;
                count++;
            }
            if(extra>0){
                prev=temp;
                temp=temp.next;
                extra--;
            }
            prev.next=null;
            res[i]=currh;
        }
        return res;
    }
}