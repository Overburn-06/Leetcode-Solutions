class Solution {
    public int subarraySum(int[] nums, int k) {
        int []arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ans=0;
            for(int j=i;j<nums.length;j++){
                if(i==0){
                    ans=arr[j];
                }
                else{
                    ans=arr[j]-arr[i-1];
                }
                if(ans==k) count++;
            }
        }
        return count++;
    }
}