class Solution {
    static void sub(int len,int []nums,int i,ArrayList<Integer>arr,List<List<Integer>>res){
        if(i>=len){
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        sub(len,nums,i+1,arr,res);
        arr.remove(arr.size()-1);
        sub(len,nums,i+1,arr,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        sub(nums.length,nums,0,arr,res);
        return res;
    }
}