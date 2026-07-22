class Solution {
    public long minCost(int[] nums, int[] cost) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(long i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        long l=min;
        long r=max;
        long res=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            long total_mid=total_operation(mid,nums,cost);
            long total_mid_one=total_operation(mid+1,nums,cost);
            res=Math.min(total_mid,total_mid_one);
            if(total_mid<total_mid_one){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public static long total_operation(long mid,int[]nums,int[]cost){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(mid-nums[i])*cost[i];
        }
        return sum;
    }
    
}