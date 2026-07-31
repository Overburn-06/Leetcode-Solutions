class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        String s=Integer.toString(Math.abs(x));
        char[] ch= s.toCharArray();
        s="";
        int i=ch.length-1;
        while(ch[i]==0){
            i--;
        }
        long res=0;
        for(int j=i;j>=0;j--){
           res=res*10+(ch[j]-'0');
        }

        long ans=res;
        if(ans>=Integer.MAX_VALUE) return 0;
        if((-ans)<=Integer.MIN_VALUE ) return 0;
        if(x<0) return (int)(-ans);
        return (int)(ans);
    }
}