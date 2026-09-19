class ListNode{
    int val;
    int key;
    int freq;
    ListNode next;
    ListNode prev;
    public ListNode(int val,int key){
        this.val=val;
        this.key=key;
        this.freq=1;
        next=null;
        prev=null;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    public DLL(){
        this.size = 0;
        this.head = new ListNode(0,0);
        this.tail = new ListNode(0,0);
        head.next = tail;
        tail.prev = head;

    }
     public void delete(ListNode node){
        ListNode prev=node.prev;
        ListNode next=node.next;
        prev.next=next;
        next.prev=prev;
        size--;
    }
    public void add(ListNode node){
        ListNode temp=head.next;
        head.next=node;
        node.next=temp;
        node.prev=head;
        temp.prev=node;
        size++;
    }

}
class LFUCache {
    HashMap<Integer,ListNode>map;
    HashMap<Integer,DLL>frequency;
    int capacity;
    int minfreq;
    int cursize;
    public LFUCache(int capacity) {
        map=new HashMap<>();
        frequency=new HashMap<>();
        this.minfreq=0;
        this.cursize=0;
        this.capacity=capacity;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }else{
            ListNode node=map.get(key);
            update_node(node);
            return node.val;
        }
    }
    public void update_node(ListNode node){
        int node_freq=node.freq;
        DLL node_list=frequency.get(node_freq);
        node_list.delete(node);

        if(node_freq==minfreq && node_list.size==0){
            minfreq++;
        }
        node.freq+=1;
        DLL newList=frequency.getOrDefault(node.freq,new DLL());
        newList.add(node);
        frequency.put(node.freq,newList);
    }
    public void put(int key, int value) {
        if(capacity==0){
            return;
        }else if(map.containsKey(key)){
            ListNode node=map.get(key);
            node.val=value;
            update_node(node);
        }else{
            cursize++;
            if(cursize>capacity){
                DLL min_freqlist=frequency.get(minfreq);
                map.remove(min_freqlist.tail.prev.key);
                min_freqlist.delete(min_freqlist.tail.prev);
                cursize--;
            }
            minfreq=1;
            ListNode node =new ListNode(value,key);
            DLL curList=frequency.getOrDefault(1,new DLL());
            curList.add(node);
            frequency.put(1,curList);
            map.put(key,node);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */