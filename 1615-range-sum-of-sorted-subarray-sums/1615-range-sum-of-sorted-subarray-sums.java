class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int s=(n*(n+1))/2;
        long []prefix=new long[s];
        int a=0;
        int b=1;
        long sum=nums[a]+nums[b++];
        int z=0;
        prefix[z++]=nums[a];
        while(a<n){
            prefix[z++]=sum;
            if(b==n){
                a++;
                b=a;
                sum=0;
            }
            if(b<n){
                sum+=nums[b];
                b++;
            }
        }
        Arrays.sort(prefix);
        sum=0;
        for(int i=left-1;i<right;i++){
            sum=(sum%(1000000007)+prefix[i]%(1000000007))%(1000000007);
        }
        return (int)sum;
    }
}