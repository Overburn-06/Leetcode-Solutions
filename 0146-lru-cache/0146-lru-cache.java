class ListNode{
    int val;
    int key;
    ListNode next;
    ListNode prev;
    public ListNode(int val,int key){
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    HashMap<Integer,ListNode>map;
    ListNode head;
    ListNode tail;
    int capacity;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        head=new ListNode(-1,-1);
        tail=new ListNode(-1,-1);
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public void delete(ListNode node){
        ListNode prev=node.prev;
        ListNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    public void insert(ListNode node){
        ListNode next=head.next;
        head.next=node;
        node.prev=head;
        node.next=next;
        next.prev=node;
    } 
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node=map.get(key);
        delete(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            delete(node);
            map.remove(key);
            node.val=value;
            map.put(key,node);
            insert(node);
        }
       else{
            if(map.size()==capacity){
                int k=tail.prev.key;
                delete(tail.prev);
                map.remove(k);
            }
            if(!map.containsKey(key)){
                ListNode node=new ListNode(value,key);
                map.put(key,node);
                insert(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */