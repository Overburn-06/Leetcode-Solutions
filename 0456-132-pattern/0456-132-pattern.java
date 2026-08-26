class Solution {
    public boolean find132pattern(int[] nums) {
          Stack<Integer>st=new Stack<>();
          int num3=Integer.MIN_VALUE;
          for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<num3){ // if we already have jth and kth number so if any number less than kth number is found it satisfies our relation of nums[i]<nums[k]<nums[j] 
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i]){ //would create a monotonic stack with increasing elements and if any number greater than top is found will pop and that number could be used for kth number and we had relation in which kth number < jth number
                num3=Math.max(st.pop(),num3);
            }
            st.push(nums[i]); // else just push number into stack
          }
        return false;
    }
}