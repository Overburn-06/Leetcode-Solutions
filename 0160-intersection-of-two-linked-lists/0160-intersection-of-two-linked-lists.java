/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashMap<ListNode,Integer> mp=new HashMap<>();
//         ListNode temp=headA;
//         while(temp!=null){
//             mp.put(temp,1);
//             temp=temp.next;
//         }
//         temp=headB;
//         while(temp!=null){
//             if(mp.containsKey(temp)){
//                 return temp;
//             }
//             temp=temp.next;
//         }
//         return null;
//     }
// }


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0;
        int b=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            a++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            b++;
            tempB=tempB.next;
        }
        while(a>b){
            a--;
            headA=headA.next;
        }
        while(b>a){
            b--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}