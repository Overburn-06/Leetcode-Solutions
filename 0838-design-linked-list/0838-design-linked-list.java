class MyLinkedList {

    private int size;
    private Node head;
    private Node tail;

    public class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value =val;

        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }
    }

    public MyLinkedList() {
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    
    public int get(int index) {
        if(index>=size ||index<0){
            return -1;
        }

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.value;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=newnode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(tail==null){
            addAtHead(val);
            return;
        }
        Node newnode=new Node(val);
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index<=0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newnode=new Node(val);
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            if(size==0) tail=null;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1) tail=temp;
        size--;
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