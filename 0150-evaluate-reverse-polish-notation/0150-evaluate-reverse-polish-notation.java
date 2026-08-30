class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>ist=new Stack<>();    
        int res=0;
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            if(ch.equals("*")||ch.equals("+")||ch.equals("-")||ch.equals("/")){
                if(!ist.isEmpty()){
                    int s2=ist.pop();
                    int s1=ist.pop();
                
                    if(ch.equals("*")){
                        res=s1*s2;
                    }else if(ch.equals("+")) res=s1+s2;
                    else if(ch.equals("-")) res=s1-s2;
                    else{
                        res=s1/s2;
                    }
                }
                System.out.println(res);
                ist.push(res);
            }else{
               ist.push(Integer.parseInt(ch));
            }
        }
        return res;
    }
}