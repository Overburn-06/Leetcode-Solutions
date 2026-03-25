class Solution {
    public int hammingWeight(int n) {
        int result=0;
        while(n>0){
            int r=n&1;
            n=n>>1;
            if(r==1){
                result++;
            }
        }
        return result;
    }
}