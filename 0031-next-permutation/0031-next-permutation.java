class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0){
            if(nums[i]>nums[i-1]){
                int j=nums.length-1;
                while(j>=i){
                    if(nums[j]>nums[i-1]){
                        int temp=nums[j];
                        nums[j]=nums[i-1];
                        nums[i-1]=temp;
                        break;
                    }
                    j--;
                }
                int x=i;
                int z=nums.length-1;
                while(x<z){
                    int temp=nums[z];
                    nums[z]=nums[x];
                    nums[x]=temp;
                    x++;
                    z--;
                }
                return;
            }
            i--;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}