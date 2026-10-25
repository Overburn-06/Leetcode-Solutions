class Solution {
    public int sortPermutation(int[] nums) {
        int k=0;
        boolean flag=true;
       for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                if(k==0 && flag==true){
                    k=nums[i];
                    flag=false;
                }else{
                    k=nums[i]&k;
                }
            }
       }
       return k;
    }
}