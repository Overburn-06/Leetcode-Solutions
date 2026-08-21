class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left=0;
        int right=nums[nums.length-1]-nums[0];
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<nums.length-1;i++){
                if(Math.abs(nums[i+1]-nums[i])<=mid){
                    count++;
                    i++;
                }   
            }
            if(count>=p){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;

    }
}