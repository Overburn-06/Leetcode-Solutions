class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long>res=new ArrayList<>();
        Stack<Long>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(!st.isEmpty()&&st.peek()==nums[i]){
                long sum=st.pop()*2;
                while(!st.isEmpty() && st.peek()==sum){
                    sum=st.pop()*2;
                }
                st.push(sum);
            }else{
                st.push((long)nums[i]);
            }
        }
        for(Long i:st){
            res.add(i);
        }
        return res;
    }
}