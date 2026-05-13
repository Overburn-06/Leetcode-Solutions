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
    static void paths(TreeNode root,ArrayList<ArrayList<Integer>>arr,ArrayList<Integer>temp){
        if(root==null) return ;
        temp.add(root.val);
        if(isLeaf(root)){
            arr.add(new ArrayList<>(temp));
        }
        paths(root.left,arr,temp);
        paths(root.right,arr,temp);
        temp.remove(temp.size()-1);
        return;
    }
    static boolean isLeaf(TreeNode root){
        if(root.left==null&&root.right==null) return true;
        return false;
    }
    public List<String> binaryTreePaths(TreeNode root) {    
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        List<String>res=new ArrayList<>();
        paths(root,arr,temp);
        for(int i=0;i<arr.size();i++){
        StringBuilder st=new StringBuilder();
            for(int j=0;j<arr.get(i).size();j++){
                st.append(arr.get(i).get(j));
                if(j!=arr.get(i).size()-1){
                    st.append("->");
                }
            }
            res.add(st.toString());
        }
        return res;
    }
}