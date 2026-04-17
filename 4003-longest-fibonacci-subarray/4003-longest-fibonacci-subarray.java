class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int count =2;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]+nums[i-2]==nums[i]){
                count++;
            }
            else{
                if(count>=max){
                    max=count;
                }
                count=2;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}