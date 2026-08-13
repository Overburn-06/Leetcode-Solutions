class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=0;
        for(long i:nums){
            max=Math.max(max,i);
        }
        int n=nums.length;
        int left=0;
        int right=0;
        long count=0;
        long max_count=0;
        while(right<n){
            if((long)nums[right]==max){
                max_count++;
            }
            while(max_count>=k){ //check if total count becomes =<k then add till last subsequnce as till end it can be valid subarray
                count+=n-right;
                if(nums[left]==max){
                    max_count--;
                }
                left++; //move left till we get max
            }
            right++;
        }
        return count;
    }
}