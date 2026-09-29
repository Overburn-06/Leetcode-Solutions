// import java.math.BigInteger;
// class Solution {
//     public String kthLargestNumber(String[] nums, int k) {
//         PriorityQueue<BigInteger> maxh = new PriorityQueue<>((a, b) -> b.compareTo(a));
//         for(int i=0;i<nums.length;i++){
//             maxh.offer(new BigInteger(nums[i]));
//         }
//         while(k!=1){
//             maxh.poll();
//             k--;
//         }
//         return maxh.poll().toString();
//     }
// }

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       Arrays.sort(nums,(a,b)->{
        if(a.length()!=b.length()){
            return Integer.compare(a.length(),b.length());
        }
        return a.compareTo(b);
       });
       return nums[nums.length-k];
    }
}
