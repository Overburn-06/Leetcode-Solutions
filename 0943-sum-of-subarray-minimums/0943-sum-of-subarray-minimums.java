class Solution {
    public int sumSubarrayMins(int[] arr) {
       int mod=(int)1000000007;
       long sum=0;
       int []nse=new int [arr.length];
       int []prse=new int[arr.length];
       nse=get_nse(arr,nse);
       prse=get_prse(arr,prse);
       for(int i=0;i<arr.length;i++){
        int left=i-prse[i];
        int right=nse[i]-i;
        sum=(sum+(long)left*right*arr[i]%mod)%mod;
       }
       return (int)sum;
    }
    int[] get_prse(int []arr,int []prse){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            prse[i]=st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return prse;
    }
    int[] get_nse(int []arr,int []nse){
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length: st.peek();
            st.push(i);
        }
        return nse;
    }
}