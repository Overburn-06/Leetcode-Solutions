class Solution {
    public int scoreOfParentheses(String s) {
     Stack<String>st=new Stack<>();
     int score=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(st.isEmpty()){
            st.push(ch+"");
        }else{
            if(ch==')'){
                int count=0;
                while(!st.isEmpty() && !st.peek().equals("(")){
                    count+=Integer.parseInt(st.peek());
                    st.pop();
                }
                st.pop();
                if(count==0){
                    st.push("1");
                }else{
                    st.push(count*2+"");
                }
            }else{
                st.push(ch+"");
            }
        }
    }
    for(String i:st){
        score+=Integer.parseInt(i);
    }
     return score;
    }
}