class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int maxx=0;
        int z_count=0;
        while(right<nums.length){
            if(nums[right]==0)z_count++;
            while(z_count>k){
                if(nums[left]==0){
                    z_count--;
                }
                left++;
            }
            maxx=Math.max(maxx,right-left+1);
            right++;
            
        }
        return maxx;
    }
}