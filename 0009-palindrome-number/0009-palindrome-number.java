class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=x;
        int num=0;
        while(x>0){
            int digit=x%10;
            num=num*10+digit;
            x=x/10;
        }
        if(n==num)return true;
        return false;
    }
}