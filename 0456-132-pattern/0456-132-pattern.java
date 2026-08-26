class Solution {
    public boolean find132pattern(int[] nums) {
          Stack<Integer>st=new Stack<>();
          int num3=Integer.MIN_VALUE;
          for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<num3){
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i]){
                num3=st.pop();
            }
            st.push(nums[i]);
          }
        return false;
    }
}