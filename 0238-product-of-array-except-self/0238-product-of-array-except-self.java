class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int z_count=0;
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z_count++;
                continue;
            }
                product*=nums[i];
            
        }
        // System.out.print(product);
        for(int i=0;i<arr.length;i++){
            if(nums[i]!=0){
                if(z_count>0){
                    arr[i]=0;
                }else{
                    arr[i]=product/nums[i];
                }
            }else{
                if(z_count>1){
                    arr[i]=0;
                }else{
                    arr[i]=product;
                }
            }
        }
        return arr;
    }
}