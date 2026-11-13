class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n=maxHeights.size();
        Stack<Integer>st=new Stack<>();
        long []prefix=new long[n];
        long []suffix=new long[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& maxHeights.get(st.peek())>maxHeights.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                prefix[i]=1l*maxHeights.get(i)*(i+1);
            }
            else{
                int idx=st.peek();
                prefix[i]=prefix[idx]+1l*(i-idx)*maxHeights.get(i);
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& maxHeights.get(st.peek())>maxHeights.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                suffix[i]=1l*maxHeights.get(i)*(n-i);
            }
            else{
                int idx=st.peek();
                suffix[i]=suffix[idx]+1l*(idx-i)*maxHeights.get(i);
            }
            st.push(i);
        }
        long max_sum=0;
        for(int i=0;i<n;i++){
            max_sum=Math.max(max_sum,prefix[i]+suffix[i]-maxHeights.get(i));
        }
        return max_sum;
    }
}