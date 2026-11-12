class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max_length=1;
        int l=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                l++;
                max_length=Math.max(l,max_length);
            }else{
                l=1;
            }
        }
        l=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                l++;
                max_length=Math.max(l,max_length);
            }else{
                l=1;
            }
        }
        return max_length;
    }
}