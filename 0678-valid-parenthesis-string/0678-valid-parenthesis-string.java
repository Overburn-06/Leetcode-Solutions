class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>brack_stack=new Stack<>();
        Stack<Integer>astr_stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                brack_stack.push(i);
            }else if(ch=='*'){
                astr_stack.push(i);
            }else{
                if(!brack_stack.isEmpty()){
                    brack_stack.pop();
                }else if(!astr_stack.isEmpty()){
                    astr_stack.pop();
                }else{
                    return false;
                }
            }
        }
        while(!brack_stack.isEmpty()){
            if(astr_stack.isEmpty()) return false;
            int brack_idx=brack_stack.pop();
            int astr_idx=astr_stack.pop();
            if(astr_idx<brack_idx) return false;
        }
        return true;
    }
}