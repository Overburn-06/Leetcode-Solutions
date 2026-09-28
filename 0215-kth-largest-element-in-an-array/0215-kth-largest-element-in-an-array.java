// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer>maxh=new PriorityQueue<>((a,b)->(b-a));
//         for(int i:nums){
//             maxh.offer(i);
//         }
//         while(k!=1){
//             maxh.poll();
//             k--;
//         }
//         return maxh.poll();
//     }
// }

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}