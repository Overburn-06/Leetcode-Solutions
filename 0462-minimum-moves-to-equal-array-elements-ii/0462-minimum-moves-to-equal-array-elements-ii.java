class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int min=0;
        for(int i=0;i<nums.length;i++){
            min+=Math.abs(mid-nums[i]);
        }
        return min;
    }
}