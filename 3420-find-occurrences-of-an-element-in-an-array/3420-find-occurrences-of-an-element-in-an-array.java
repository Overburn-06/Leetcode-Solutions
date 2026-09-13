class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,List<Integer>>idx=new HashMap<>();
        int []res=new int[queries.length];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(!idx.containsKey(nums[i])){
                idx.put(nums[i],new ArrayList<>());
            }
            idx.get(nums[i]).add(i);
        }
        for(int i=0;i<queries.length;i++){
            if(map.containsKey(x)){
                if( map.get(x)<queries[i]){
                    res[i]=-1;
                }else{
                    res[i]=idx.get(x).get(queries[i]-1);
                }
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}