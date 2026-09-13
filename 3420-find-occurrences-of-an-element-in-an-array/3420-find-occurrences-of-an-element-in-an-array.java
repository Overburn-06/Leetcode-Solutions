class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>idx=new ArrayList<>();
        int []res=new int[queries.length];
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                idx.add(i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(idx.size()>=queries[i]){
                res[i]=idx.get(queries[i]-1);
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}