class ListNode{
    String url;
    ListNode next;
    ListNode prev;
    public ListNode(String url){
        this.url=url;
        this.next=next;
        this.prev=prev;
    }
}
class BrowserHistory {
    ListNode head;
    ListNode tail;
    ListNode temp;
    String homepage;

    public BrowserHistory(String homepage) {
        homepage=homepage;
        head=new ListNode("start");
        tail=new ListNode("end");
        ListNode node=new ListNode(homepage);
        head.next=node;
        node.prev=head;
        node.next=tail;
        tail.prev=node;
        temp=node;

    }
    
    public void visit(String url) {
        ListNode node=new ListNode(url);
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
        temp=node;
    }
    
    public String back(int steps) {
        if(temp.url.equals(homepage)){
            return temp.url;
        }
        ListNode curr=temp;
        while(steps!=0 && curr.next!=tail){
            curr=curr.next;
            steps--;
        }
        temp=curr;
        return curr.url;
    }
    
    public String forward(int steps) {
        if(temp.prev==head)return temp.url;
        ListNode curr=temp;
        while(steps!=0 && curr.prev!=head){
            curr=curr.prev;
            steps--;
        }
        temp=curr;
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */