class Solution {
    static void sub(int ind,int len,int []nums,ArrayList<Integer>arr,List<List<Integer>>res){
              res.add(new ArrayList<>(arr));
        for(int i=ind;i<len;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            arr.add(nums[i]);
            sub(i+1,len,nums,arr,res);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len=nums.length;
        ArrayList<Integer>arr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        sub(0,len,nums,arr,res);
        return res;
    }
}