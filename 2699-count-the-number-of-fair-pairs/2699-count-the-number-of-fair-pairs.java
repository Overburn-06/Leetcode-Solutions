class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long pairs=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int idx=lower_bound(nums,i+1,nums.length-1,lower-nums[i]); // return idx whose value is less than lower-nums[i],so sum is always less than lower
            int x=idx;
            idx=upper_bound(nums,i+1,nums.length-1,upper-nums[i]); //returns idx whose value is less than equal to upper -nums[i]
            int y=idx;
            pairs+=y-x; // y-x removes all the numbers less than lower in y and adds the total number of possible pair
        }
        return pairs;
    }
    int lower_bound(int []nums,int start,int end ,int target){
        int idx=end+1;// if no index found then return total length
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                idx=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }
    int upper_bound(int []nums,int start,int end ,int target){
        int idx=end+1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                idx=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }



    
}