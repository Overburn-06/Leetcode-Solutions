class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && !set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            }
        // }
        // for(int num:set){
        //     sum+=num;
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