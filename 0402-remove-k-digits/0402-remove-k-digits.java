class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        if(num.length()==k) return "0";
        int n=k;
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && (k>0 && (int)ch<(int)st.peek())){
                st.pop();
                k--;
            }
            st.push(ch);
        }
         
        while(!st.isEmpty() && k!=0){
            st.pop();
            k--;
        }
        
        StringBuilder res=new StringBuilder();
        for(char i:st){
            res.append(i);
        }
        
        int i=0;

        while (i < res.length() && res.charAt(i) == '0') {
            res.deleteCharAt(i);
        }
        if(res.length()==0) return "0";
        return res.toString();
    }
}