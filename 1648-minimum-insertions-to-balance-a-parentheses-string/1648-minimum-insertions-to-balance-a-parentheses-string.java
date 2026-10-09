class Solution {
    public int minInsertions(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }else{
                if(count>0){
                    count--;
                    if((i+1<s.length()) && s.charAt(i+1)==')'){
                        i++;
                    }else{
                        ans++;
                    }
                }
                else{
                    if((i+1<s.length()) && s.charAt(i+1)==')'){
                        ans++;
                        i++;
                    }else{
                        ans+=2;
                    }
                }
            }
        }
        if(count!=0){
            ans+=count*2;
        }
        return ans;
    }
}