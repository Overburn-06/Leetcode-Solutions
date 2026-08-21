class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left=0;
        int right=nums[nums.length-1]-nums[0];
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(count(nums,p,mid)){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;

    }
    boolean count(int []nums,int p,int mid){
        int count=0;
        int i=0;
        while(i<nums.length-1){
            if(Math.abs(nums[i+1]-nums[i])<=mid){
                count++;
                i+=2;
            }else{
                i++;
            } 
            if(count==p)return true;
        }
        return false;
    }
}