class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i)return i;
        }
        return -1;
    }
    public int sum(int x){
        int s=0;
        while(x>0){
            int digit=x%10;
            s+=digit;
            x=x/10;
        }
        return s;
    }
}