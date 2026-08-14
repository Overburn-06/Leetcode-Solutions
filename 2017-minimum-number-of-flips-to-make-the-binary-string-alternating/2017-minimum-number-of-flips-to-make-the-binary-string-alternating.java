class Solution {
    public int minFlips(String s) {
        int count=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int c1=0;
        int c2=0;
        int n=s.length();
        while(right<n*2){
            char s1=(right%2==0)?'0':'1';
            char s2=(right%2==0)?'1':'0';

            if(s.charAt(right%n)!=s1){
                c1++;
            }
            if(s.charAt(right%n)!=s2){
                c2++;
            }
            if(right-left+1>n){
                s1=(left%2==0) ? '0':'1';
                s2=(left%2==0) ? '1':'0';
                if(s.charAt(left%n)!=s1){
                    c1--;
                }
                if(s.charAt(left%n)!=s2){
                    c2--;
                }
                left++;
            }
            if(right-left+1==n){
                count=Math.min(count,Math.min(c1,c2));
            }
            right++;
        }
        return count;
    }
}