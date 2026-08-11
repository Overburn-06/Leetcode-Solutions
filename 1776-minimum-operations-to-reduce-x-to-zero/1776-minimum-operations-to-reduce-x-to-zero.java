// class Solution {
//     public int minOperations(int[] nums, int x) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         map.put(0,-1);
//         int sum=0;
//         for(int i:nums){
//             sum+=i;
//         }
//         int target_sum=sum-x;
//         if(target_sum==0) return nums.length;
//         int count =Integer.MIN_VALUE;
//         sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             int diff=sum-target_sum;
//             if(map.containsKey(diff)){
//                 count=Math.max(count,i-map.get(diff));
//             }
//             if(!map.containsKey(sum)){
//                 map.put(sum,i);
//             }
//         }
//         if(count==Integer.MIN_VALUE) return -1;
//         return nums.length-count;
//     }
// }  

class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int target_sum=sum-x;
        if(target_sum==0) return nums.length;
        int count =Integer.MIN_VALUE;
        sum=0;
        int left=0;
        int right=0;
        for(right=0;right<nums.length;right++){
            sum+=nums[right];
            while(left<=right && sum>target_sum){
                sum-=nums[left];
                left++;
            }
            if(sum==target_sum){
                count=Math.max(count,right-left+1);
            }
        }
        if(count==Integer.MIN_VALUE) return -1;
        return nums.length-count;
    }
}  