class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int i=0;
        while(j<nums.length){
            int count=1;
            while(j+1<nums.length && nums[j]==nums[j+1]){
                count++;
                j++;
            }
            count=Math.min(count,2);
            for(int x=0;x<count;x++){
                nums[i]=nums[j];
                ++i;
            }
            j++;
        }
        return i;
    }
}