class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int s=(n*(n+1))/2;
        int []prefix=new int[s];
        int a=0;
        int b=1;
        long sum=nums[a]+nums[b++];
        int z=0;
        prefix[z++]=nums[a];
        while(a<n){
            prefix[z++]=(int)sum;
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
            sum=(sum+prefix[i])%(1000000007);
        }
        return (int)sum;
    }
}