class Solution {
    public int[] singleNumber(int[] nums) {
        int []res=new int[2];
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            x=x^nums[i];
        }
        int diff_bit=1;
        while((x&diff_bit)==0){
            diff_bit=diff_bit<<1;
        }
        ArrayList<Integer>n1=new ArrayList<>();
        ArrayList<Integer>n2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((nums[i]&diff_bit)!=0){
                n1.add(nums[i]);
            }else{
                n2.add(nums[i]);
            }
        }
        int num1=0;
        int num2=0;
        for(int i=0;i<n1.size();i++){
            num1=num1^n1.get(i);
        }
        for(int i=0;i<n2.size();i++){
            num2=num2^n2.get(i);
        }
        res[0]=num1;
        res[1]=num2;
        return res;
    }
}