// class Solution {
//     public int minMoves(int[] nums) {
//         int min_element=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             min_element=Math.min(nums[i],min_element);
//         }
//         int min_step=0;
//         for(int i=0;i<nums.length;i++){
//             min_step+=nums[i]-min_element;
//         }
//         return min_step;
//     }
// }

class Solution {
    public int minMoves(int[] nums) {
        int min_element=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            min_element=Math.min(nums[i],min_element);
            sum+=nums[i];
        }
        int min_step=sum-nums.length*min_element;
        return min_step;
    }
}