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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        ListNode curr=head;
        int []res=new int[count];
        int j=0;
        while(curr!=null){
            temp=curr.next;
            while(temp!=null){
                if(temp.val>curr.val){
                    res[j]=temp.val;
                    break;
                }
                temp=temp.next;
            }
            j++;
            curr=curr.next;
        }
        return res;
    }
}