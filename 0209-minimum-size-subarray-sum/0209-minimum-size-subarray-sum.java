class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int count=Integer.MAX_VALUE;
        int sum=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                count=Math.min(count,i-j+1);
                sum-=nums[j];
                j++;
                flag=true;
            }
        }
        if(!flag) return 0;
        return count;
    }
}