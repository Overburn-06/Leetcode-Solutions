class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        int c1=0;
        int c2=0;
        for(char ch:s.toCharArray()){

            if(ch=='('){
                c1++;
            }else if(ch==')'){
                c2++;
            }
            if(c1==c2){
                c1=0;
                c2=0;
                StringBuilder temp=new StringBuilder();
                while(st.size()>1){
                    temp.append(st.pop());
                }
                ans.append(temp.reverse());
                st.pop();
                continue;
            }
            st.push(ch);
        }
        return ans.toString();
    }
}