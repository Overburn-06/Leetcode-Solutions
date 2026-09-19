class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class MyCircularQueue {
    ListNode head;
    ListNode tail;
    int capacity;
    int count;
    public MyCircularQueue(int k) {
        head=new ListNode(-1);
        tail=new ListNode(-1);
        capacity=k;
        head.next=tail;
        tail.prev=head;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        ListNode node=new ListNode(value);
        ListNode next=head.next;
        head.next=node;
        node.next=next;
        next.prev=node;
        node.prev=head;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        ListNode prev=tail.prev.prev;
        prev.next=tail;
        tail.prev=prev;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        else{
            ListNode node=tail.prev;
            return node.val;
        }
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        else{
            return head.next.val;
        }
    }
    
    public boolean isEmpty() {
        if(count==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(capacity==count) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */