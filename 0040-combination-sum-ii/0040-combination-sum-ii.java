class Solution {
    static void combination(int ind,int []candidates,int target,List<List<Integer>>res,ArrayList<Integer>arr){
        if(target==0){
            res.add(new ArrayList<>(arr));
            return ;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(target<candidates[i]) break;
            arr.add(candidates[i]);
            combination(i+1,candidates,target-candidates[i],res,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer>arr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,res,arr);
        return res;
    }
}