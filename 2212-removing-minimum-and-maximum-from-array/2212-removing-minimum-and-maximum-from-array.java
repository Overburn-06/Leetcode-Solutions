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
        
        int left=Math.min(min_i,max_i); //would have value of index on left 
        int right=Math.max(min_i,max_i);//would have value of index on right side

        int front=right+1; // if both are on left side than index with greater vaue +1 would give total deletion
        int back=nums.length-left; // if both are on the back than total length - the element on left max would give total deletion
        int both=(left+1)+(nums.length-right); // if one is on left and other on right side then left +1 would give total deleteion on left and totol length - right index would give total deletion on right
        
        return Math.min(both,Math.min(front,back)); // min of all gives minimum deletion
    }
}