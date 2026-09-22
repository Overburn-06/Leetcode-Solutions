class Solution {
    public int partitionDisjoint(int[] nums) {
        int []maxLeft=new int[nums.length];
        int []minRight=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            maxLeft[i]=max;
        }
       
        int min=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            minRight[i]=min;
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            if(maxLeft[i]<=minRight[i]){
                return i+1;
            }
        }
        return nums.length-1;
    }
}