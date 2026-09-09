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
        
        ListNode []res=new ListNode[k];
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int n=count/k;
        int extra=count%k;
        temp=head;
        
        for(int i=0;i<k;i++){
            if(temp==null) return res;
            res[i]=temp;
            int total=n;
            if(extra>0){
                total+=1;
                extra--;
            }
            for(int j=1;j<total;j++){
                temp=temp.next;
            }
            ListNode t=temp.next;
            temp.next=null;
            temp=t;
        }
        return res;
    }
}