class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        int max_neg=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && !set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            }
            if(nums[i]<=0)
            max_neg=Math.max(max_neg,nums[i]);
        }
        if(sum==0){
            return max_neg;
        }
        return sum;
    }
}