class Solution {
    public int minLength(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='B'){
                if(!st.isEmpty()&& st.peek()=='A'){
                    st.pop();
                    continue;
                }
                st.push(ch);
            }else if(ch=='D'){
                if(!st.isEmpty()&& st.peek()=='C'){
                    st.pop();
                    continue;
                }
                st.push(ch);
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}