/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void rview(TreeNode root,ArrayList<Integer>ans,Queue<TreeNode>qu){
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(qu.peek().left!=null){
                    qu.add(qu.peek().left);
                }
                if(qu.peek().right!=null){
                    qu.add(qu.peek().right);
                }
                temp.add(qu.remove().val);
            }
            ans.add(temp.get(temp.size()-1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>qu=new LinkedList<>();
        rview(root,ans,qu);
        return ans;
    }
}