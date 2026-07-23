class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int r=nums[nums.length-1];
        int l=nums[0];
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int total_mid=total_operation(nums,mid);
            int total_mid_one=total_operation(nums,mid+1);
            ans=Math.min(total_mid,total_mid_one);
            if(total_mid_one<total_mid){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static int total_operation(int []nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(mid-nums[i]);
        }
        return sum;
    }
}