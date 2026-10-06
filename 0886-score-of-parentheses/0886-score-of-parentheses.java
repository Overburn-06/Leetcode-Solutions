class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        Stack<Integer>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ans);
                ans=0;
            }else{
                ans=st.pop()+Math.max(2*ans,1);
            }
        }
        return ans;
    }
}