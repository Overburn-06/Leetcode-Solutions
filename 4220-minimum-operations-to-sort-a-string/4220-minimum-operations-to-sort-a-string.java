class Solution {
    public int minOperations(String s) {
        boolean sorted=true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)>s.charAt(i)){
                sorted=false;
                break;
            }
        }
        if(sorted==true)return 0;
        if(s.length()==2) return -1;
        int minidx=0;
        int maxidx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(minidx)>s.charAt(i)){
                minidx=i;
            }
            if(s.charAt(maxidx)<=s.charAt(i)){
                maxidx=i;
            }
        }
        if(0==minidx || maxidx==s.length()-1) return 1;
        if((0==maxidx) && minidx==(s.length()-1)) return 3;
        
        return 2;
    }
}