/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null)return 0;
        Queue<Node>qu=new LinkedList<>();
        qu.offer(root);
        int depth=1;
        while(!qu.isEmpty()){
            int n=qu.size();
            while(n!=0){
                Node temp=qu.poll();
                for(Node node:temp.children){
                    if(node!=null)qu.offer(node);
                }
                n--;
            }
            depth++;
        }
        return depth-1;
    }
}