class Solution {
    public int sumSubarrayMins(int[] arr) {
       int mod=(int)1000000007;
       long sum=0;
       int []nse=new int [arr.length];// contains next smaller index of each element
       int []prse=new int[arr.length];// contains previous smaller index of each
       nse=get_nse(arr,nse);
       prse=get_prse(arr,prse);
       for(int i=0;i<arr.length;i++){
        int left=i-prse[i];//gives number of elements before index i
        int right=nse[i]-i;// gives number of elements after index i
        sum=(sum+(long)left*right*arr[i]%mod)%mod; //total number of subarray formed by index i is elements on left*right and for getting sum multiply by that element 
       }
       return (int)sum;
    }
    int[] get_prse(int []arr,int []prse){ // used stack and stored index of smaller element and returned array
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            prse[i]=st.isEmpty()? -1 : st.peek(); // stack empty then no previous smaller so store -1 else top index
            st.push(i);
        }
        return prse;
    }
    int[] get_nse(int []arr,int []nse){//stored smallest element after index i
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length: st.peek(); // if stack is empty then store last index or top index
            st.push(i);
        }
        return nse;
    }
}