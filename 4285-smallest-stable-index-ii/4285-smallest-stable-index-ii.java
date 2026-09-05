class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []pre_min=new int[nums.length];
        int min=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            pre_min[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            maxx=Math.max(nums[i],maxx);
            if(maxx-pre_min[i]<=k) return i;
        }
        return -1;
    }
}