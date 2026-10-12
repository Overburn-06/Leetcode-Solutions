class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int c1=0;
        int c2=0;
        int m1=0;
        int m2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1){
                c1++;
            }else if(nums[i]==m2){
                c2++;
            }else if(c1==0){
                m1=nums[i];
                c1=1;
            }else if(c2==0){
                m2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1)count1++;
            if(nums[i]==m2)count2++;
        }
        if(count1>(nums.length)/3 && m1!=m2)res.add(m1);
        if(count2>(nums.length)/3)res.add(m2);

        return res;
    }
}