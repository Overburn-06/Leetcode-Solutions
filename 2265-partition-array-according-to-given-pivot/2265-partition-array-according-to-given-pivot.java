class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l_count=0;
        int s_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) l_count++;
            if(nums[i]==pivot) s_count++;
        }
        int []ans=new int[nums.length];
        int a=0;
        int b=l_count+s_count;
        int c=l_count;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot && a<l_count){
                ans[a++]=nums[i];
            }else if(nums[i]>pivot && b<nums.length){
                ans[b++]=nums[i];
            }else{
                ans[c++]=nums[i];
            }
        }
        return ans;
    }
}