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
        Stack<ListNode>st1=new Stack<>();
        Stack<ListNode>st2=new Stack<>();
        Stack<Integer>st=new Stack<>();
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=null){
            st1.push(t1);
            t1=t1.next;
        }while(t2!=null){
            st2.push(t2);
            t2=t2.next;
        }
        int carry=0;
        ListNode res=new ListNode();
        ListNode curr=res;
        while(!st1.isEmpty()&& !st2.isEmpty()){
            int n1=st1.pop().val;
            int n2=st2.pop().val;
            int sum=n1+n2+carry;
            if(sum>9){
                carry=1;
                sum=sum%10;
            }else{
                carry=0;
            }
            st.push(sum);
        }
        while(!st1.isEmpty()){
            if(carry==1){
                int s=st1.pop().val+1;
                if(s>9){
                    carry=1;
                    st.push(s%10);
                }else{
                    st.push(s);
                    carry=0;
                }
                continue;
            }
            st.push(st1.pop().val);
        }
        while(!st2.isEmpty()){
            if(carry==1){
                int s=st2.pop().val+1;
                if(s>9){
                    carry=1;
                    st.push(s%10);
                }else{
                    st.push(s);
                    carry=0;
                }
                continue;
            }
            st.push(st2.pop().val);
        }
        if(carry==1)st.push(1);
        while(!st.isEmpty()){
            curr.next=new ListNode(st.pop());
            curr=curr.next;
        }
        return res.next;
    }
}