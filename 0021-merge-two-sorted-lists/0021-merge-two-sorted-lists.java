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
//  import java.util.*;
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode head1=list1;
//         ListNode head2=list2;
//         ArrayList<Integer>arr=new ArrayList<>();
//         while(head1!=null){
//             arr.add(head1.val);
//             head1=head1.next;
//         }
//         while(head2!=null){
//             arr.add(head2.val);
//             head2=head2.next;
//         }
//         Collections.sort(arr);
//         for(int i:arr){
//             System.out.print(i);
//         }
//         ListNode head=null;
//         ListNode tail=null;
//         for(int i=0;i<arr.size();i++){
//             ListNode node=new ListNode(arr.get(i));
//             if(head==null){
//                 head=node;
//                 tail=node;
//             }
//             else{
//                 tail.next=node;
//                 tail=node;
//             }
//         }
//         return head;
//     }
// }


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }
        if(t2!=null){
            temp.next=t2;
        }
        
        return dummy.next;
    }
}