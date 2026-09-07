class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!st.contains(i)) return i;
        }
        return -1;
    }
}