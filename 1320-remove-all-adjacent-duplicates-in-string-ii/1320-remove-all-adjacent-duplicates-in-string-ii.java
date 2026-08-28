class Pair{
    char ch;
    int count;
    Pair(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek().ch==ch){
                st.peek().count++;
                if(st.peek().count==k) st.pop();
            }else{
                st.push(new Pair(ch,1));
            }
        }
        StringBuilder res= new StringBuilder();
        while(!st.isEmpty()){
            int count=st.peek().count;
            char ch=st.peek().ch;
            while(count>0){
                res.append(ch);
                count--;
            }
            st.pop();
        }
        return res.reverse().toString();
    }
}