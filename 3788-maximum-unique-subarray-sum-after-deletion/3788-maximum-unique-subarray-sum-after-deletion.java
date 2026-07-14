class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int sum=0;
        for(int num:set){
            sum+=num;
        }
        int max=nums[0];
        if(sum==0){
            for(int i=1;i<nums.length;i++){
                if(nums[i]>max)max=nums[i];
            }
            return max;
        }
        return sum;
    }
}