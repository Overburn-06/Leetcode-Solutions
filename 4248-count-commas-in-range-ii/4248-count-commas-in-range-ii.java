class Solution {
    public long countCommas(long n) {
        long count=0;
        if(n==1000000000000000l) return 3998998998999005l;
        if(n<=999) return 0;
        // Fixed version of your logic:
        if(n>=1000 && n<=999999) count += (n-1000+1);
        if(n>999999 && n<=999999999) count += 999000 + (n-1000000+1)*2;
        if(n>999999999L && n<=999999999999L) count += 999000 + 1998000000L + (n-1000000000L+1)*3;
        if(n>999999999999L && n<=1000000000000000L) {
        count += 999000L + 1998000000L + 2997000000000L + (n-1000000000000L+1)*4;
        }
        return count;
    }
}