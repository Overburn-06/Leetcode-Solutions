class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr=new int[nums.length];
        int pf=1;
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=pf*nums[i-1];
            pf=arr[i];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        int sf=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=sf*arr[i];
            sf=nums[i]*sf;
        }
        return arr;
    }
}