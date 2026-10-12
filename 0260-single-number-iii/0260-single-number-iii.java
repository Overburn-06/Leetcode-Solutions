class Solution {
    public int[] singleNumber(int[] nums) {
        int []res=new int[2];
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            x=x^nums[i];
        }
        int diff_bit=(x&(-x));
        
        int num1=0;
        int num2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&diff_bit)!=0){
                num1=num1^nums[i];
            }else{
                num2=num2^nums[i];
            }
        }
        res[0]=num1;
        res[1]=num2;
        return res;
    }
}