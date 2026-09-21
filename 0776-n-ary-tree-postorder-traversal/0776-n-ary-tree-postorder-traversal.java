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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>res=new ArrayList<>();
        if(root==null)return res;
        n_post(root,res);
        return res;
    }
    public void n_post(Node root,List<Integer>res){
        Stack<Node>st1=new Stack<>();
        Stack<Node>st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node temp=st1.pop();
            for(Node node:temp.children){
                if(node!=null){
                    st1.push(node);
                }
            }
            st2.push(temp);
        }
        while(!st2.isEmpty()){
            res.add(st2.pop().val);
        }
    }
}