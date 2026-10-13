class Solution {
    public long maxAlternatingSum(int[] nums) {
        int re_ordered[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            re_ordered[i]=Math.abs(nums[i]);
        }
        Arrays.sort(re_ordered);
        int left=0;
        int right=nums.length-1;
        long sum=0;
        while(left<right){
            sum+=re_ordered[right]*re_ordered[right]-re_ordered[left]*re_ordered[left];
            left++;
            right--;
        }
        if(left==right){
            sum+=re_ordered[left]*re_ordered[left];
        }
        return sum;
    }
}