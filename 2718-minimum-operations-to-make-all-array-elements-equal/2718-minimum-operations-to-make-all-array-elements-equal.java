class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long>res=new ArrayList<>();
        int m=queries.length;
        Arrays.sort(nums);
        long []prefix=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
        for(int i=0;i<queries.length;i++){
            int l=0;
            int r=nums.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(queries[i]<=nums[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            int idx=l;
            long left_sum=0;
            long right_sum=0;
            if(idx!=0){
                left_sum=prefix[idx-1];
            }
            right_sum=sum-left_sum;
            long t_left=0;
            long t_right=0;
            t_left=(long)queries[i]*idx-left_sum;
            t_right=right_sum-(long)queries[i]*(nums.length-idx);
            res.add(t_left+t_right);
        }
        return res;
    }
}