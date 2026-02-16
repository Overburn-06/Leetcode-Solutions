class Solution {
    static void combination(int i,int []candidates,int target,List<List<Integer>>res,ArrayList<Integer>arr){
        if(i==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(arr));
            }
            return;
        }
        if(candidates[i]<=target){
            arr.add(candidates[i]);
            combination(i,candidates,target-candidates[i],res,arr);
            arr.remove(arr.size()-1);
        }
        combination(i+1,candidates,target,res,arr);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer>arr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        combination(0,candidates,target,res,arr);
        return res;
    }
}