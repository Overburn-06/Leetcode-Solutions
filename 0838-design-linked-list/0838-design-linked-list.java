class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int val){
        this.val=val;
        next=null;
        prev=null;
    }
}
class MyLinkedList {
    ListNode head;
    ListNode tail;
    int count=0;
    public MyLinkedList() {
        head=new ListNode(-1);
        tail=new ListNode(-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int index) {
       
        if(index < 0 || index >= count) return -1;
        if(index==0)return head.next.val;
        ListNode temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode node =new ListNode(val);
        ListNode next=head.next;
        head.next=node;
        node.next=next;
        next.prev=node;
        node.prev=head;
        count++;
    }
    
    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        ListNode prev=tail.prev;
        prev.next=node;
        node.prev=prev;
        node.next=tail;
        tail.prev=node;
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(count>=index){
            ListNode temp=head;
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            ListNode node=new ListNode(val);
            ListNode prev=temp.prev;
            prev.next=node;
            node.prev=prev;
            node.next=temp;
            temp.prev=node;
            count++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=count) return ;
        if(index==0){
            ListNode next=head.next.next;
            head.next=next;
            next.prev=head;
            count--;
        }else if(index==count-1){
            ListNode prev=tail.prev.prev;
            prev.next=tail;
            tail.prev=prev;
            count--;
        }
        else{
            ListNode temp=head;
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            ListNode prev=temp.prev;
            prev.next=temp.next;
            temp.next.prev=prev;
            count--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */