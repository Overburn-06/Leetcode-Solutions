class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int []prefix=new int[n];
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums.get(i);
            prefix[i]=sum;
        }

        int min_sum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int len=j-i+1;
                int s=prefix[j]-prefix[i]+nums.get(i);
                if(len>=l&&len<=r&&s>0){
                    min_sum=Math.min(min_sum,s);
                }
            }
        }
        if(min_sum!=Integer.MAX_VALUE) return min_sum;
        return -1;
    }
}