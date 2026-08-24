class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String s[]=path.split("/");
        for(int i=0;i<s.length;i++){
            if(!st.isEmpty() && s[i].equals("..")){
                st.pop();
                continue;
            }
            if(s[i].equals(".")||s[i].equals("")||s[i].equals("..")) continue;
            else{
                st.push(s[i]);
            }
        }
        String res="";
        if(st.isEmpty())return "/";
        while(!st.isEmpty()){
            res="/"+st.pop()+res;
        }
        return res;
    }
}