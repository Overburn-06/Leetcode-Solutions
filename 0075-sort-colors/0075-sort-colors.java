class Solution {
    public void sortColors(int[] nums) {
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i:nums){
            if(i==0) c1++;
            if(i==1) c2++;
            if(i==2) c3++;
        }
            int i=0;
            while(c1>0){
                nums[i++]=0;
                c1--;
            }
            while(c2>0){
                nums[i++]=1;
                c2--;
            }
            while(c3>0){
                nums[i++]=2;
                c3--;
            }
    }
}