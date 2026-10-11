class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        int z=1;
        for(int i:nums){
            if(n%z==0)sum+=(i*i);
            z++;
        }
        return sum;
    }
}