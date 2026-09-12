class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int []res=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count=0;
            while(!st.isEmpty() && heights[i]>st.peek()){
                count++;
                st.pop();
            }
            if(!st.isEmpty() && st.peek()>heights[i]){
                count+=1;
            }
            res[i]=count;
            st.push(heights[i]);
        }
        return res;
    }
}