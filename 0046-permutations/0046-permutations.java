class Solution {
    static void permu(int ind,int len,int []nums,ArrayList<Integer>arr,List<List<Integer>>res,boolean[]freq){
        if(arr.size()==len){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<len;i++){
            if(!freq[i]){
                freq[i]=true;
                arr.add(nums[i]);
                permu(i+1,len,nums,arr,res,freq);
                arr.remove(arr.size()-1);
                freq[i]=false;
            }

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        int len=nums.length;
        boolean []freq=new boolean[len];
        permu(0,len,nums,arr,res,freq);
        return res;
    }
}