class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            // if(nums[mid]<nums[mid+1]) return nums[mid];
            if(mid-1>=0 && nums[mid-1]>nums[mid]) return nums[mid];
            if(nums[high]>=nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return nums[0];
    }
}