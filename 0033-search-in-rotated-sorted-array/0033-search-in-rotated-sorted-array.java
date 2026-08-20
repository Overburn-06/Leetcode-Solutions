class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int peak=0;
        int n=nums.length-1;
        if(nums.length==1 && nums[0]==target)return 0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        peak=right;
        System.out.println(peak);
        int res=search(nums,target,0,peak-1);
        if(res!=-1) return res ;
        else{
            res=search(nums,target,peak,nums.length-1);
        }
        return res;
    }
    int search(int []nums,int target,int left,int right){

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}