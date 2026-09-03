class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C")){
                st.pop();
            }else if(ch.equals("D")){
                int top=st.peek();
                st.push(top*2);
            }else if(ch.equals("+")){
                int first=st.pop();
                int second=st.peek();
                st.push(first);
                st.push(first+second);
            }else{
                st.push(Integer.parseInt(ch));
            }
            
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}