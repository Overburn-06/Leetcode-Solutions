class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min_i=-1;
        int max_i=-1;
        if(nums.length==1)return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                min_i=i;
            }
            if(nums[i]>max){
                max=nums[i];
                max_i=i;
            }
        }
        
        int left=Math.min(min_i,max_i);
        int right=Math.max(min_i,max_i);

        int front=right+1;
        int back=nums.length-left;
        int both=(left+1)+(nums.length-right);
        
        return Math.min(both,Math.min(front,back));
    }
}