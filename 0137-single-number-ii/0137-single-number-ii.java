class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int k=0;k<32;k++){
            int temp=(1<<k);
            int count_ones=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i]&temp)!=0)count_ones++;
            }
            // System.out.println(count_ones);
            if(count_ones%3==1){
                res=(res|temp);
            }
        }
        return res;
    }
}