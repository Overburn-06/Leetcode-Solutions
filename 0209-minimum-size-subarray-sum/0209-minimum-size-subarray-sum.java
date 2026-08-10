class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int count=Integer.MAX_VALUE;
        long prefix[]=new long[nums.length];
        prefix[0]=(long)nums[0];
        for(int z=1;z<nums.length;z++){
            prefix[z]=prefix[z-1]+(long)nums[z];
        }
        boolean flag=false;
        while(j<nums.length){
            if(i<nums.length && (prefix[j]-prefix[i]+(long)nums[i])>=target){
                count=Math.min(count,j-i+1);
                i++;
                flag=true;
            }else{
                j++;
            }
        }
        if(!flag) return 0;
        return count;
    }
}