class Solution {
    public int maxDepth(String s) {
        int count =0;
        Stack<Character>st=new Stack<>();
        for(Character i:s.toCharArray()){
            if(i=='('){
                st.push(i);
            }
            if(i==')'){
               count=Math.max(count,st.size());
               st.pop();
            }
        }
        return count;
    }
}