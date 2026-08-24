class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String s[]=path.split("/");
        for(int i=0;i<s.length;i++){
            if(s[i].equals("..")){// if s[i] is .. then we have to move back to parent directory and if stack is empty we just continue
                if(!st.isEmpty()){
                    st.pop();
                }
                continue;
            }
            if(s[i].equals(".")||s[i].equals("")) continue; // as split will give some empty strings and if s[i] is . then we have to skip adding it to stack 
            else{
                st.push(s[i]); // else all other things are pushed to stack
            }
        }
        if(st.isEmpty())return "/";

        StringBuilder res=new StringBuilder();
        for(String ans:st){
            res.append("/").append(ans);
        }
        return res.toString();
    }
}