class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1)return true;
        int maxreachable=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreachable)return false;
            maxreachable=Math.max(nums[i]+i,maxreachable);
        }
        return true;
    }
}