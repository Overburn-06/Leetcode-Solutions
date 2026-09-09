class Solution {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length){
            k=k%nums.length;
        }
        nums=reverse(nums,0,nums.length-1);
        nums=reverse(nums,0,k-1);
        nums=reverse(nums,k,nums.length-1);
    }
    int[] reverse(int []nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}