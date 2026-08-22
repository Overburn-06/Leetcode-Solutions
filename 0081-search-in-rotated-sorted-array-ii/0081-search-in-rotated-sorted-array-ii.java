class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){// would check if low ,mid and high are of same then we cannt tell which one is sorted half so we would skip the duplicates by shrinking our array from both ends and would result in distinct elements
                low++;
                high--;
                continue;
            }
            if(nums[mid]>=nums[low]){ // would check left side as it is sorted 
                if(nums[low]<=target && nums[mid]>=target){// would divide left into half
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{// if not left than right side should be checked 
                if(nums[high]>=target && nums[mid]<=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}