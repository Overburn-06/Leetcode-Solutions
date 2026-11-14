class Solution {
    public int largestRectangleArea(int[] heights) {
        int []ns=nse(heights);
        int []ps=pse(heights);
        int res=0;
        for(int i=0;i<heights.length;i++){
            res=Math.max(res,heights[i]*(ns[i]-ps[i]-1));
        }
        return res;
    }
    public int[] nse(int []heights){
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int []ns=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i]=n;
            }else{
                ns[i]=st.peek();
            }
            st.push(i);
        }
        return ns;
    }
    public int[] pse(int []heights){
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int []ps=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=st.peek();
            }
            st.push(i);
        }
        return ps;
    }
}