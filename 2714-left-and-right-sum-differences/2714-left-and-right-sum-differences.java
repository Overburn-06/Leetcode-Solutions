class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix[]=new int [nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
        int []res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int left_sum=0;
            if(i!=0) left_sum=prefix[i-1];
            int right_sum=prefix[nums.length-1]-prefix[i];
            int total=Math.abs(left_sum-right_sum);
            res[i]=total;
        }
        return res;
    }
}